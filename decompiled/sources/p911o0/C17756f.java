package p911o0;

import android.view.View;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import p049Bm.InterfaceC1436k;
import p1095x1.InterfaceC21059M;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p758g0.C13775m0;
import p979r2.C18862c;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C17756f implements InterfaceC17760h, InterfaceC17766k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56694a;

    public /* synthetic */ C17756f(int i10) {
        this.f56694a = i10;
    }

    /* JADX INFO: renamed from: d */
    public static final C17754e m19478d(int i10, String str) {
        WeakHashMap weakHashMap = C17718B0.f56555v;
        return new C17754e(i10, str);
    }

    /* JADX INFO: renamed from: e */
    public static final C17795y0 m19479e(int i10, String str) {
        WeakHashMap weakHashMap = C17718B0.f56555v;
        return new C17795y0(AbstractC17758g.m19492n(C18862c.f60085e), str);
    }

    /* JADX INFO: renamed from: f */
    public static C17718B0 m19480f(C6021p c6021p) {
        C17718B0 c17718b0;
        View view = (View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f);
        WeakHashMap weakHashMap = C17718B0.f56555v;
        synchronized (weakHashMap) {
            try {
                Object c17718b1 = weakHashMap.get(view);
                if (c17718b1 == null) {
                    c17718b1 = new C17718B0(view);
                    weakHashMap.put(view, c17718b1);
                }
                c17718b0 = (C17718B0) c17718b1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean zM6545h = c6021p.m6545h(c17718b0) | c6021p.m6545h(view);
        Object objM6514H = c6021p.m6514H();
        if (zM6545h || objM6514H == C6013l.f19514a) {
            objM6514H = new C13775m0(c17718b0, 29, view);
            c6021p.m6537c0(objM6514H);
        }
        C5997d.m6444c(c17718b0, (InterfaceC1436k) objM6514H, c6021p);
        return c17718b0;
    }

    @Override // p911o0.InterfaceC17760h, p911o0.InterfaceC17766k
    /* JADX INFO: renamed from: a */
    public float mo455a() {
        switch (this.f56694a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return 0;
    }

    @Override // p911o0.InterfaceC17766k
    /* JADX INFO: renamed from: b */
    public void mo456b(int i10, InterfaceC21059M interfaceC21059M, int[] iArr, int[] iArr2) {
        switch (this.f56694a) {
            case 2:
                AbstractC17770m.m19496c(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC17770m.m19495b(iArr, iArr2, false);
                break;
        }
    }

    @Override // p911o0.InterfaceC17760h
    /* JADX INFO: renamed from: c */
    public void mo457c(InterfaceC7537b interfaceC7537b, int i10, int[] iArr, EnumC7546k enumC7546k, int[] iArr2) {
        switch (this.f56694a) {
            case 0:
                AbstractC17770m.m19495b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC17770m.m19496c(i10, iArr, iArr2, false);
                break;
            case 2:
            default:
                if (enumC7546k != EnumC7546k.f23904Y) {
                    AbstractC17770m.m19496c(i10, iArr, iArr2, true);
                } else {
                    AbstractC17770m.m19495b(iArr, iArr2, false);
                }
                break;
            case 3:
                if (enumC7546k != EnumC7546k.f23904Y) {
                    AbstractC17770m.m19495b(iArr, iArr2, true);
                } else {
                    AbstractC17770m.m19496c(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f56694a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#Bottom";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            case 5:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
