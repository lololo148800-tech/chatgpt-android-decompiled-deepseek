package p1027tp;

import mm.C17296C;
import mo.AbstractC17325B;
import mo.AbstractC17329F;
import mo.C17328E;
import p026Ao.C0675i;

/* JADX INFO: renamed from: tp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C20057a implements InterfaceC20067k {

    /* JADX INFO: renamed from: Z */
    public static final C20057a f63546Z = new C20057a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C20057a f63547o0 = new C20057a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C20057a f63548p0 = new C20057a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C20057a f63549q0 = new C20057a(3);

    /* JADX INFO: renamed from: r0 */
    public static final C20057a f63550r0 = new C20057a(4);

    /* JADX INFO: renamed from: s0 */
    public static final C20057a f63551s0 = new C20057a(5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63552Y;

    public /* synthetic */ C20057a(int i10) {
        this.f63552Y = i10;
    }

    @Override // p1027tp.InterfaceC20067k
    /* JADX INFO: renamed from: a */
    public final Object mo15962a(Object obj) {
        switch (this.f63552Y) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC17329F abstractC17329F = (AbstractC17329F) obj;
                try {
                    C0675i c0675i = new C0675i();
                    abstractC17329F.mo18988O0().mo1341F0(c0675i);
                    return new C17328E(abstractC17329F.mo18990e(), abstractC17329F.mo18989a(), c0675i, 0);
                } finally {
                    abstractC17329F.close();
                }
            case 2:
                return (AbstractC17325B) obj;
            case 3:
                return (AbstractC17329F) obj;
            case 4:
                ((AbstractC17329F) obj).close();
                return C17296C.f55119a;
            default:
                ((AbstractC17329F) obj).close();
                return null;
        }
    }
}
