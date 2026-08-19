package p457Sh;

import io.ktor.client.plugins.auth.C15057b;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p008A6.C0383c;
import p049Bm.InterfaceC1436k;
import p407Qh.InterfaceC6732b;
import p409Qk.C6754e;

/* JADX INFO: renamed from: Sh.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7133a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22693Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Set f22694Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7133a(int i10, Set set) {
        super(1);
        this.f22693Y = i10;
        this.f22694Z = set;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f22693Y) {
            case 0:
                C15057b install = (C15057b) obj;
                AbstractC16544l.m18094g(install, "$this$install");
                install.f46786a.addAll(this.f22694Z);
                break;
            case 1:
                C15057b install2 = (C15057b) obj;
                AbstractC16544l.m18094g(install2, "$this$install");
                install2.f46786a.addAll(this.f22694Z);
                break;
            default:
                C6754e config = (C6754e) obj;
                AbstractC16544l.m18094g(config, "$this$config");
                Iterator it = this.f22694Z.iterator();
                while (it.hasNext()) {
                    config.m7190a(((InterfaceC6732b) it.next()).mo2504b(), new C0383c(7));
                }
                break;
        }
        return C17296C.f55119a;
    }
}
