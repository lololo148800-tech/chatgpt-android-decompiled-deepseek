package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import ge.C14103t0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p1095x1.AbstractC21075b0;
import p1095x1.C21081e0;
import p1139z0.C21585H;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p562X0.InterfaceC9009d;
import p635a1.InterfaceC10459q;
import p953q0.AbstractC18567Z;
import p953q0.AbstractC18589k0;
import p953q0.C18553K;
import p953q0.C18566Y;
import p953q0.RunnableC18568a;
import ph.C18416d;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10847b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18566Y f32544Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f32545Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1439n f32546o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f32547p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10847b(C18566Y c18566y, InterfaceC10459q interfaceC10459q, InterfaceC1439n interfaceC1439n, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f32544Y = c18566y;
        this.f32545Z = interfaceC10459q;
        this.f32546o0 = interfaceC1439n;
        this.f32547p0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC10459q interfaceC10459qMo428M;
        int i10 = 2;
        InterfaceC9009d interfaceC9009d = (InterfaceC9009d) obj;
        C6021p c6021p = (C6021p) obj2;
        ((Number) obj3).intValue();
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            objM6514H = new C18553K(interfaceC9009d, new C14103t0(this.f32547p0, 10));
            c6021p.m6537c0(objM6514H);
        }
        C18553K c18553k = (C18553K) objM6514H;
        Object objM6514H2 = c6021p.m6514H();
        if (objM6514H2 == c5975s) {
            objM6514H2 = new C21081e0(new C21585H(c18553k));
            c6021p.m6537c0(objM6514H2);
        }
        C21081e0 c21081e0 = (C21081e0) objM6514H2;
        C18566Y c18566y = this.f32544Y;
        if (c18566y != null) {
            c6021p.m6524S(205264983);
            Object obj4 = c18566y.f59144a;
            if (obj4 == null) {
                c6021p.m6524S(6622915);
                obj4 = AbstractC18589k0.f59228a;
                if (obj4 != null) {
                    c6021p.m6524S(1213893039);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1213931944);
                    View view = (View) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32829f);
                    boolean zM6542f = c6021p.m6542f(view);
                    Object objM6514H3 = c6021p.m6514H();
                    if (zM6542f || objM6514H3 == c5975s) {
                        objM6514H3 = new RunnableC18568a(view);
                        c6021p.m6537c0(objM6514H3);
                    }
                    obj4 = (RunnableC18568a) objM6514H3;
                    c6021p.m6553p(false);
                }
            } else {
                c6021p.m6524S(6621830);
            }
            c6021p.m6553p(false);
            Object obj5 = obj4;
            Object[] objArr = {c18566y, c18553k, c21081e0, obj5};
            boolean zM6542f2 = c6021p.m6542f(c18566y) | c6021p.m6545h(c18553k) | c6021p.m6545h(c21081e0) | c6021p.m6545h(obj5);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f2 || objM6514H4 == c5975s) {
                C1307e c1307e = new C1307e(c18566y, c18553k, c21081e0, obj5, 29);
                c6021p.m6537c0(c1307e);
                objM6514H4 = c1307e;
            }
            C5997d.m6448e(objArr, (InterfaceC1436k) objM6514H4, c6021p);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(205858881);
            c6021p.m6553p(false);
        }
        int i11 = AbstractC18567Z.f59149b;
        InterfaceC10459q interfaceC10459q = this.f32545Z;
        if (c18566y != null && (interfaceC10459qMo428M = interfaceC10459q.mo428M(new TraversablePrefetchStateModifierElement(c18566y))) != null) {
            interfaceC10459q = interfaceC10459qMo428M;
        }
        boolean zM6542f3 = c6021p.m6542f(c18553k);
        InterfaceC1439n interfaceC1439n = this.f32546o0;
        boolean zM6542f4 = zM6542f3 | c6021p.m6542f(interfaceC1439n);
        Object objM6514H5 = c6021p.m6514H();
        if (zM6542f4 || objM6514H5 == c5975s) {
            objM6514H5 = new C18416d(c18553k, i10, interfaceC1439n);
            c6021p.m6537c0(objM6514H5);
        }
        AbstractC21075b0.m21563d(c21081e0, interfaceC10459q, (InterfaceC1439n) objM6514H5, c6021p, 8);
        return C17296C.f55119a;
    }
}
