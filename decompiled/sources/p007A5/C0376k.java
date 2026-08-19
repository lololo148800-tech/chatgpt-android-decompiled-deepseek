package p007A5;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import p001A.C0063g0;
import p079D.AbstractC1762b;
import p1098x5.C21129h;
import p1138z.C21572a;
import p228J.AbstractC3810L;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3835f0;
import p228J.C3847l0;
import p348O.AbstractC5939a;
import p397Q5.C6579h;
import p496U5.InterfaceC7561c;
import p817j$.util.DesugarCollections;
import p909nm.C17689w;

/* JADX INFO: renamed from: A5.k */
/* JADX INFO: loaded from: classes.dex */
public class C0376k implements InterfaceC0374i, InterfaceC7561c, DFS.Neighbors {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1277Y;

    /* JADX INFO: renamed from: Z */
    public boolean f1278Z;

    public /* synthetic */ C0376k(int i10, boolean z6) {
        this.f1277Y = i10;
    }

    /* JADX INFO: renamed from: e */
    public static C3799E m1010e(C3799E c3799e) {
        C0063g0 c0063g0 = new C0063g0();
        c0063g0.f283a = c3799e.f11484c;
        Iterator it = DesugarCollections.unmodifiableList(c3799e.f11482a).iterator();
        while (it.hasNext()) {
            ((HashSet) c0063g0.f286d).add((AbstractC3810L) it.next());
        }
        c0063g0.m243c(c3799e.f11483b);
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        c3825a0M4558d.m4561x(C21572a.m21847d0(CaptureRequest.FLASH_MODE), 0);
        c0063g0.m243c(new C21572a(C3835f0.m4568a(c3825a0M4558d), 8));
        return c0063g0.m244d();
    }

    @Override // p007A5.InterfaceC0374i, p496U5.InterfaceC7561c
    /* JADX INFO: renamed from: a */
    public boolean mo1008a() {
        switch (this.f1277Y) {
            case 0:
                break;
        }
        return this.f1278Z;
    }

    @Override // p007A5.InterfaceC0374i
    /* JADX INFO: renamed from: b */
    public boolean mo1009b(C21129h c21129h) {
        return this.f1278Z;
    }

    @Override // p496U5.InterfaceC7561c
    /* JADX INFO: renamed from: c */
    public boolean mo1011c(C6579h c6579h) {
        return this.f1278Z;
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m1012d() {
        this.f1278Z = false;
    }

    /* JADX INFO: renamed from: f */
    public void m1013f(String str, String message) {
        AbstractC16544l.m18094g(message, "message");
        if (this.f1278Z) {
            Log.d("AS/".concat(str), message);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m1014g(ArrayList arrayList, boolean z6) {
        if (!this.f1278Z || !z6) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors;
        CallableMemberDescriptor original = (CallableMemberDescriptor) obj;
        int i10 = DescriptorUtilsKt.f52893a;
        if (this.f1278Z) {
            original = original != null ? original.getOriginal() : null;
        }
        return (original == null || (overriddenDescriptors = original.getOverriddenDescriptors()) == null) ? C17689w.f56480Y : overriddenDescriptors;
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m1015h() {
        if (this.f1278Z) {
            return false;
        }
        this.f1278Z = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1016i(ArrayList arrayList, boolean z6) {
        if (this.f1278Z && z6) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                if (iIntValue == 2 || iIntValue == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public /* synthetic */ C0376k(boolean z6, int i10) {
        this.f1277Y = i10;
        this.f1278Z = z6;
    }

    public C0376k(int i10, C3847l0 c3847l0) {
        this.f1277Y = i10;
        switch (i10) {
            case 4:
                this.f1278Z = c3847l0.m4578e(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.f1278Z = c3847l0.m4578e(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public C0376k(int i10) {
        this.f1277Y = i10;
        switch (i10) {
            case 3:
                this.f1278Z = AbstractC1762b.f5032a.m4579f(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            case 6:
                this.f1278Z = AbstractC5939a.f19323a.m4579f(SurfaceOrderQuirk.class) != null;
                break;
            case 9:
                this.f1278Z = false;
                break;
            default:
                this.f1278Z = ((StillCaptureFlashStopRepeatingQuirk) AbstractC1762b.f5032a.m4579f(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
        }
    }
}
