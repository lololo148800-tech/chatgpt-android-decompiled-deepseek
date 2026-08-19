package p679ce;

import com.openai.feature.conversations.impl.anonymous.AnonymousSidebarViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: ce.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C11718i extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f35534Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AnonymousSidebarViewModel f35535Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11718i(AnonymousSidebarViewModel anonymousSidebarViewModel, int i10) {
        super(0);
        this.f35534Y = i10;
        this.f35535Z = anonymousSidebarViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f35534Y) {
            case 0:
                this.f35535Z.m14395k(C11714e.f35529a);
                break;
            case 1:
                this.f35535Z.m14395k(C11712c.f35527a);
                break;
            case 2:
                this.f35535Z.m14395k(C11713d.f35528a);
                break;
            case 3:
                this.f35535Z.m14395k(new C11711b(EnumC11710a.SideBar));
                break;
            default:
                this.f35535Z.m14395k(new C11711b(EnumC11710a.TopBar));
                break;
        }
        return C17296C.f55119a;
    }
}
