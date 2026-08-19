package p513Uo;

import java.util.ArrayList;
import p438Ro.InterfaceC6969a;
import p535Vo.C8404a;
import p584Xo.C9538a;
import p712dp.C13187c;
import p712dp.InterfaceC13188d;

/* JADX INFO: renamed from: Uo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7726b implements InterfaceC13188d, InterfaceC6969a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24351a;

    public /* synthetic */ C7726b(int i10) {
        this.f24351a = i10;
    }

    @Override // p712dp.InterfaceC13188d
    /* JADX INFO: renamed from: a */
    public final void mo7540a(C13187c c13187c) {
        switch (this.f24351a) {
            case 0:
                ((ArrayList) c13187c.f41847e).add(new C8404a());
                break;
            default:
                c13187c.f41845c.add(new C9538a(0));
                break;
        }
    }
}
