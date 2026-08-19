package p003A1;

import android.view.View;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import java.util.ArrayList;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p110E4.C2307e;
import p153Fn.C2925c;
import p349O0.C6032u0;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: A1.V1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0214V1 implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2925c f812Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0296v0 f813Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C6032u0 f814o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16525B f815p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ View f816q0;

    public C0214V1(C2925c c2925c, C0296v0 c0296v0, C6032u0 c6032u0, C16525B c16525b, View view) {
        this.f812Y = c2925c;
        this.f813Z = c0296v0;
        this.f814o0 = c6032u0;
        this.f815p0 = c16525b;
        this.f816q0 = view;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        int i10 = AbstractC0202R1.f750a[enumC11103l.ordinal()];
        if (i10 == 1) {
            AbstractC0575H.m1156D(this.f812Y, null, EnumC0573G.f1793p0, new C0211U1(this.f815p0, this.f814o0, interfaceC11112u, this, this.f816q0, null), 1);
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f814o0.m6600B();
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f814o0.m6607w();
                return;
            }
        }
        C0296v0 c0296v0 = this.f813Z;
        if (c0296v0 != null) {
            C2307e c2307e = (C2307e) c0296v0.f1069o0;
            synchronized (c2307e.f7159o0) {
                try {
                    if (!c2307e.m3403o()) {
                        ArrayList arrayList = (ArrayList) c2307e.f7160p0;
                        c2307e.f7160p0 = (ArrayList) c2307e.f7161q0;
                        c2307e.f7161q0 = arrayList;
                        c2307e.f7158Z = true;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((InterfaceC18770c) arrayList.get(i11)).resumeWith(C17296C.f55119a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f814o0.m6605I();
    }
}
