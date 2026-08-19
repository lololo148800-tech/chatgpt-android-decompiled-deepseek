package p1139z0;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p530Vi.AbstractC8301I;

/* JADX INFO: renamed from: z0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C21597U extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f68405Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CharSequence f68406Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f68407o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21597U(int i10, int i11, CharSequence charSequence) {
        super(1);
        this.f68405Y = i11;
        this.f68406Z = charSequence;
        this.f68407o0 = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f68405Y) {
            case 0:
                AbstractC21627m.m21963k((C21577C) obj, String.valueOf(this.f68406Z), this.f68407o0);
                break;
            default:
                C21577C c21577c = (C21577C) obj;
                String strValueOf = String.valueOf(this.f68406Z);
                int i10 = c21577c.f68329f;
                if (i10 != -1) {
                    c21577c.m21858f(i10, c21577c.f68330g, strValueOf);
                    if (strValueOf.length() > 0) {
                        c21577c.m21859g(i10, strValueOf.length() + i10);
                    }
                } else {
                    int i11 = c21577c.f68326c;
                    c21577c.m21858f(i11, c21577c.f68327d, strValueOf);
                    if (strValueOf.length() > 0) {
                        c21577c.m21859g(i11, strValueOf.length() + i11);
                    }
                }
                int i12 = c21577c.f68326c;
                int i13 = c21577c.f68327d;
                int i14 = i12 == i13 ? i13 : -1;
                int i15 = this.f68407o0;
                int iM8921l = AbstractC8301I.m8921l(i15 > 0 ? (i14 + i15) - 1 : (i14 + i15) - strValueOf.length(), 0, c21577c.f68324a.length());
                c21577c.m21860h(iM8921l, iM8921l);
                break;
        }
        return C17296C.f55119a;
    }
}
