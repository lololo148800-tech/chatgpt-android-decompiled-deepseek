package p001A;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p028B.RunnableC0696c;
import p277L.ExecutorC4836i;
import p610Z1.C10142i;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0084r extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f334a;

    /* JADX INFO: renamed from: b */
    public final Object f335b;

    /* JADX INFO: renamed from: c */
    public Object f336c;

    public C0084r(int i10) {
        this.f334a = i10;
        switch (i10) {
            case 3:
                this.f335b = AbstractC16347a.m17947b(new C0072l(this, 19));
                break;
            default:
                this.f336c = null;
                this.f335b = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m273a(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.f335b;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public void m274b() {
        C10142i c10142i = (C10142i) this.f336c;
        if (c10142i != null) {
            c10142i.m10747a(null);
            this.f336c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public List m275c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f335b).get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
        switch (this.f334a) {
            case 1:
                Iterator it = m275c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new Runnable() { // from class: B.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f2032Y.f335b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                    }
                });
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f334a) {
            case 0:
                ((ExecutorC4836i) this.f336c).execute(new RunnableC0074m(this, 2, totalCaptureResult));
                break;
            case 1:
                Iterator it = m275c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new RunnableC0696c(this, cameraCaptureSession, captureRequest, totalCaptureResult, 0));
                break;
            default:
                m274b();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f334a) {
            case 1:
                Iterator it = m275c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new RunnableC0696c(this, cameraCaptureSession, captureRequest, captureFailure, 2));
                break;
            case 3:
                m274b();
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f334a) {
            case 1:
                Iterator it = m275c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new RunnableC0696c(this, cameraCaptureSession, captureRequest, captureResult, 1));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
        switch (this.f334a) {
            case 1:
                Iterator it = ((HashMap) this.f335b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i10);
                    }
                }
                C0081p0 c0081p0 = (C0081p0) this.f336c;
                if (c0081p0 != null) {
                    c0081p0.m267a();
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new RunnableC0078o(this, cameraCaptureSession, i10, 2));
                break;
            case 3:
                m274b();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
        switch (this.f334a) {
            case 1:
                Iterator it = ((HashMap) this.f335b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                    }
                }
                C0081p0 c0081p0 = (C0081p0) this.f336c;
                if (c0081p0 != null) {
                    c0081p0.m267a();
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new Runnable() { // from class: B.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f2028Y.f335b).onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                    }
                });
                break;
            case 3:
                m274b();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
        switch (this.f334a) {
            case 1:
                Iterator it = m275c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                }
                break;
            case 2:
                ((ExecutorC4836i) this.f336c).execute(new Runnable() { // from class: B.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f2018Y.f335b).onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                    }
                });
                break;
            case 3:
                m274b();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
                break;
        }
    }

    public C0084r(ExecutorC4836i executorC4836i, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f334a = 2;
        this.f336c = executorC4836i;
        this.f335b = captureCallback;
    }

    public C0084r(ExecutorC4836i executorC4836i) {
        this.f334a = 0;
        this.f335b = new HashSet();
        this.f336c = executorC4836i;
    }
}
