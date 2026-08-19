package p870le;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p1082wd.C20909b;
import p269Kh.C4676c;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p362Of.C6194i;
import p544W9.AbstractC8741x4;
import p635a1.InterfaceC10459q;
import p882m1.clb.WGTYqNchEpHca;
import p911o0.C17794y;

/* JADX INFO: renamed from: le.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16884h0 extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC1426a f54215Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4676c f54216Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20909b f54217o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f54218p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ ArrayList f54219q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC1436k f54220r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC10459q f54221s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC5985X f54222t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16884h0(InterfaceC1426a interfaceC1426a, C4676c c4676c, C20909b c20909b, List list, ArrayList arrayList, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f54215Y = interfaceC1426a;
        this.f54216Z = c4676c;
        this.f54217o0 = c20909b;
        this.f54218p0 = list;
        this.f54219q0 = arrayList;
        this.f54220r0 = interfaceC1436k;
        this.f54221s0 = interfaceC10459q;
        this.f54222t0 = interfaceC5985X;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C6021p c6021p = (C6021p) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC16544l.m18094g((C17794y) obj, WGTYqNchEpHca.HyoGVZmXJJXR);
        if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(2067013258);
            Object objM6514H = c6021p.m6514H();
            if (objM6514H == C6013l.f19514a) {
                objM6514H = new C6194i(this.f54222t0, 23);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            ?? r6 = this.f54218p0;
            ArrayList arrayList = this.f54219q0;
            AbstractC8741x4.m9480d(this.f54215Y, this.f54216Z, this.f54217o0, r6, arrayList, this.f54220r0, (InterfaceC1436k) objM6514H, this.f54221s0, c6021p, 1572864, 0);
        }
        return C17296C.f55119a;
    }
}
