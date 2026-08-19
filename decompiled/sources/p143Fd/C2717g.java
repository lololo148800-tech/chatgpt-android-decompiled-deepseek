package p143Fd;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p523V9.AbstractC7877E4;
import p690cp.C12911B;
import p690cp.C12912C;

/* JADX INFO: renamed from: Fd.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2717g extends AbstractC7877E4 {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8360Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f8361Z;

    public /* synthetic */ C2717g(C16525B c16525b, int i10) {
        this.f8360Y = i10;
        this.f8361Z = c16525b;
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: D */
    public void mo3707D(C12911B se) {
        switch (this.f8360Y) {
            case 0:
                AbstractC16544l.m18094g(se, "se");
                this.f8361Z.f51262Y = se;
                break;
            default:
                super.mo3707D(se);
                break;
        }
    }

    @Override // p523V9.AbstractC7877E4, p690cp.InterfaceC12914E
    /* JADX INFO: renamed from: f */
    public void mo3708f(C12912C text) {
        switch (this.f8360Y) {
            case 1:
                AbstractC16544l.m18094g(text, "text");
                C16525B c16525b = this.f8361Z;
                c16525b.f51262Y = c16525b.f51262Y + text.f41068g;
                break;
            default:
                super.mo3708f(text);
                break;
        }
    }
}
