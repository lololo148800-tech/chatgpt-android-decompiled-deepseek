package p001A;

import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.view.View;
import io.sentry.AbstractC15403m;
import io.sentry.C15153P1;
import io.sentry.C15400l;
import io.sentry.EnumC15359h;
import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.FrameCryptor;
import p053C.C1487v;
import p1072w2.InterfaceC20790b;
import p1160zp.AbstractC22225a;
import p175Gl.C3103b;
import p199Hl.C3500y;
import p229J0.C4171z3;
import p273Kl.C4727J0;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.C5231m;
import p301M.InterfaceC5219a;
import p301M.RunnableC5228j;
import p344Nl.C5825G;
import p344Nl.C5842n;
import p387Pl.AbstractC6468O;
import p387Pl.AbstractC6470Q;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8465D3;
import p544W9.AbstractC8577W2;
import p588Y2.C9614S;
import p588Y2.C9620d;
import p588Y2.C9624h;
import p593Y8.C9683j;
import p610Z1.C10142i;
import p610Z1.C10145l;
import p610Z1.InterfaceC10143j;
import p646aj.C10624d;
import p658b5.C11241l;
import p720e6.C13288c;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;
import p867l8.C16831c;
import p960q9.C18655i;

/* JADX INFO: renamed from: A.P0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0031P0 implements InterfaceC10143j, InterfaceC5219a, FrameCryptor.Observer, InterfaceC20790b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f152Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f153Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f154o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f155p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f156q0;

    public /* synthetic */ C0031P0(C0033Q0 c0033q0, CameraDevice cameraDevice, C1487v c1487v, List list) {
        this.f152Y = 1;
        this.f153Z = c0033q0;
        this.f156q0 = cameraDevice;
        this.f154o0 = c1487v;
        this.f155p0 = list;
    }

    /* JADX INFO: renamed from: a */
    public void m168a() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        File file = (File) this.f154o0;
        EnumC15375i1 enumC15375i1 = EnumC15375i1.DEBUG;
        String str = (String) this.f155p0;
        InterfaceC15127H interfaceC15127H = (InterfaceC15127H) this.f153Z;
        interfaceC15127H.mo16298o(enumC15375i1, "Started processing cached files from %s", str);
        AbstractC15403m abstractC15403m = (AbstractC15403m) this.f156q0;
        InterfaceC15127H interfaceC15127H2 = abstractC15403m.f48020b;
        try {
            interfaceC15127H2.mo16298o(enumC15375i1, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                interfaceC15127H2.mo16298o(EnumC15375i1.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    interfaceC15127H2.mo16298o(EnumC15375i1.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                } else {
                    File[] fileArrListFiles2 = file.listFiles(new C10624d(abstractC15403m, i14));
                    interfaceC15127H2.mo16298o(enumC15375i1, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
                    int length = fileArrListFiles.length;
                    int i15 = 0;
                    while (i15 < length) {
                        File file2 = fileArrListFiles[i15];
                        if (file2.isFile()) {
                            String absolutePath = file2.getAbsolutePath();
                            C15153P1 c15153p1 = abstractC15403m.f48022d;
                            if (!c15153p1.contains(absolutePath)) {
                                C9683j c9683jMo16244f = abstractC15403m.f48019a.mo16244f();
                                if (c9683jMo16244f != null && c9683jMo16244f.m10272P(EnumC15359h.All)) {
                                    interfaceC15127H2.mo16298o(EnumC15375i1.INFO, "DirectoryProcessor, rate limiting active.", new Object[i13]);
                                    break;
                                }
                                EnumC15375i1 enumC15375i2 = EnumC15375i1.DEBUG;
                                Object[] objArr = new Object[i14];
                                objArr[i13] = absolutePath;
                                interfaceC15127H2.mo16298o(enumC15375i2, "Processing file: %s", objArr);
                                abstractC15403m.mo16651b(file2, AbstractC8465D3.m9087a(new C15400l(abstractC15403m.f48021c, abstractC15403m.f48020b, absolutePath, c15153p1)));
                                Thread.sleep(100L);
                                i12 = 1;
                            } else {
                                EnumC15375i1 enumC15375i3 = EnumC15375i1.DEBUG;
                                Object[] objArr2 = new Object[i14];
                                objArr2[i13] = absolutePath;
                                interfaceC15127H2.mo16298o(enumC15375i3, "File '%s' has already been processed so it will not be processed again.", objArr2);
                            }
                            i15 += i12;
                            i14 = i12;
                            length = length;
                            i13 = 0;
                        } else {
                            EnumC15375i1 enumC15375i4 = EnumC15375i1.DEBUG;
                            Object[] objArr3 = new Object[i14];
                            objArr3[i13] = file2.getAbsolutePath();
                            interfaceC15127H2.mo16298o(enumC15375i4, "File %s is not a File.", objArr3);
                        }
                        i12 = i14;
                        i15 += i12;
                        i14 = i12;
                        length = length;
                        i13 = 0;
                    }
                }
            } else {
                interfaceC15127H2.mo16298o(EnumC15375i1.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            }
            i11 = i13;
            i10 = i14;
        } catch (Throwable th2) {
            EnumC15375i1 enumC15375i5 = EnumC15375i1.ERROR;
            String absolutePath2 = file.getAbsolutePath();
            i10 = 1;
            i11 = 0;
            interfaceC15127H2.mo16296g(enumC15375i5, th2, "Failed processing '%s'", absolutePath2);
        }
        EnumC15375i1 enumC15375i6 = EnumC15375i1.DEBUG;
        Object[] objArr4 = new Object[i10];
        objArr4[i11] = str;
        interfaceC15127H.mo16298o(enumC15375i6, "Finished processing cached files from %s", objArr4);
    }

    @Override // p301M.InterfaceC5219a
    public InterfaceFutureC13608b apply(Object obj) {
        InterfaceFutureC13608b interfaceFutureC13608bM5780d;
        C0033Q0 c0033q0 = (C0033Q0) this.f153Z;
        CameraDevice cameraDevice = (CameraDevice) this.f156q0;
        C1487v c1487v = (C1487v) this.f154o0;
        List list = (List) this.f155p0;
        if (c0033q0.f182v.f1278Z) {
            Iterator it = c0033q0.f162b.m79p().iterator();
            while (it.hasNext()) {
                ((C0033Q0) it.next()).m174j();
            }
        }
        c0033q0.m176l("start openCaptureSession");
        synchronized (c0033q0.f161a) {
            try {
                if (c0033q0.f173m) {
                    interfaceFutureC13608bM5780d = new C5231m(new CancellationException("Opener is disabled"), 1);
                } else {
                    c0033q0.f162b.m86y(c0033q0);
                    C10145l c10145lM17947b = AbstractC16347a.m17947b(new C0031P0(c0033q0, list, new C18655i(cameraDevice, c0033q0.f163c), c1487v, 0));
                    c0033q0.f168h = c10145lM17947b;
                    C13288c c13288c = new C13288c(c0033q0);
                    c10145lM17947b.mo5766a(new RunnableC5228j(c10145lM17947b, 0, c13288c), AbstractC8577W2.m9240b());
                    interfaceFutureC13608bM5780d = AbstractC5229k.m5780d(c0033q0.f168h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceFutureC13608bM5780d;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        String str;
        C0033Q0 c0033q0 = (C0033Q0) this.f153Z;
        List list = (List) this.f155p0;
        C18655i c18655i = (C18655i) this.f156q0;
        C1487v c1487v = (C1487v) this.f154o0;
        synchronized (c0033q0.f161a) {
            c0033q0.m177m(list);
            AbstractC4941g.m5559R("The openCaptureSessionCompleter can only set once!", c0033q0.f169i == null);
            c0033q0.f169i = c10142i;
            ((C11241l) c18655i.f59414Z).mo1478B(c1487v);
            str = "openCaptureSession[session=" + c0033q0 + "]";
        }
        return str;
    }

    @Override // p1072w2.InterfaceC20790b
    public void onCancel() {
        C9624h this$0 = (C9624h) this.f155p0;
        AbstractC16544l.m18094g(this$0, "this$0");
        C9620d animationInfo = (C9620d) this.f156q0;
        AbstractC16544l.m18094g(animationInfo, "$animationInfo");
        C9614S operation = (C9614S) this.f154o0;
        AbstractC16544l.m18094g(operation, "$operation");
        View view = (View) this.f153Z;
        view.clearAnimation();
        this$0.f29003a.endViewTransition(view);
        animationInfo.m770d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + operation + " has been cancelled.");
        }
    }

    @Override // livekit.org.webrtc.FrameCryptor.Observer
    public void onFrameCryptionStateChanged(String str, FrameCryptor.FrameCryptionState frameCryptionState) {
        Object obj = this.f154o0;
        Object obj2 = this.f156q0;
        Object obj3 = this.f155p0;
        Object obj4 = this.f153Z;
        switch (this.f152Y) {
            case 2:
                C3103b this$0 = (C3103b) obj4;
                AbstractC16544l.m18094g(this$0, "this$0");
                C4727J0 room = (C4727J0) obj3;
                AbstractC16544l.m18094g(room, "$room");
                AbstractC6470Q abstractC6470Q = (AbstractC6470Q) obj2;
                C5842n participant = (C5842n) obj;
                AbstractC16544l.m18094g(participant, "$participant");
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26118o0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    Objects.toString(frameCryptionState);
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18569g(new Object[0]);
                }
                C4171z3 c4171z3 = this$0.f9336f;
                if (c4171z3 == null) {
                    AbstractC16544l.m18103p("emitEvent");
                    throw null;
                }
                AbstractC6468O abstractC6468OM7055c = abstractC6470Q.m7055c();
                AbstractC16544l.m18091d(abstractC6468OM7055c);
                c4171z3.invoke(new C3500y(room, abstractC6468OM7055c, abstractC6470Q, participant, C3103b.m3927d(frameCryptionState)));
                return;
            default:
                C3103b this$1 = (C3103b) obj4;
                AbstractC16544l.m18094g(this$1, "this$0");
                C4727J0 room2 = (C4727J0) obj3;
                AbstractC16544l.m18094g(room2, "$room");
                AbstractC6470Q abstractC6470Q2 = (AbstractC6470Q) obj2;
                C5825G participant2 = (C5825G) obj;
                AbstractC16544l.m18094g(participant2, "$participant");
                C8395g c8395g2 = AbstractC8396h.Companion;
                EnumC8397i enumC8397i2 = EnumC8397i.f26118o0;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i2.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    Objects.toString(frameCryptionState);
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18569g(new Object[0]);
                }
                C4171z3 c4171z4 = this$1.f9336f;
                if (c4171z4 == null) {
                    AbstractC16544l.m18103p("emitEvent");
                    throw null;
                }
                AbstractC6468O abstractC6468OM7055c2 = abstractC6470Q2.m7055c();
                AbstractC16544l.m18091d(abstractC6468OM7055c2);
                c4171z4.invoke(new C3500y(room2, abstractC6468OM7055c2, abstractC6470Q2, participant2, C3103b.m3927d(frameCryptionState)));
                return;
        }
    }

    public /* synthetic */ C0031P0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f152Y = i10;
        this.f153Z = obj;
        this.f155p0 = obj2;
        this.f156q0 = obj3;
        this.f154o0 = obj4;
    }
}
