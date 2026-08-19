package p402Qc;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Qc.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C6586b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C6586b f21276Z = new C6586b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6586b f21277o0 = new C6586b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6586b f21278p0 = new C6586b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C6586b f21279q0 = new C6586b(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C6586b f21280r0 = new C6586b(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21281Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6586b(int i10, int i11) {
        super(i10);
        this.f21281Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21281Y) {
            case 0:
                InterfaceC1436k emit = (InterfaceC1436k) obj;
                AbstractC16544l.m18094g(emit, "emit");
                emit.invoke("DBConversation");
                emit.invoke("DBMessage");
                break;
            case 1:
                InterfaceC1436k emit2 = (InterfaceC1436k) obj;
                AbstractC16544l.m18094g(emit2, "emit");
                emit2.invoke("DBConversation");
                emit2.invoke("DBMessage");
                break;
            case 2:
                InterfaceC1436k emit3 = (InterfaceC1436k) obj;
                AbstractC16544l.m18094g(emit3, "emit");
                emit3.invoke("DBConversation");
                break;
            case 3:
                InterfaceC1436k emit4 = (InterfaceC1436k) obj;
                AbstractC16544l.m18094g(emit4, "emit");
                emit4.invoke("DBMessage");
                break;
            default:
                InterfaceC1436k emit5 = (InterfaceC1436k) obj;
                AbstractC16544l.m18094g(emit5, "emit");
                emit5.invoke("DBMessage");
                break;
        }
        return C17296C.f55119a;
    }
}
