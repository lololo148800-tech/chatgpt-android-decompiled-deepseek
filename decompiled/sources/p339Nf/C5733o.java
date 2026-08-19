package p339Nf;

import com.openai.feature.messages.MessagesViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0292u;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1441p;
import p225Im.InterfaceC3759g;
import p292Lg.C5034f;
import p349O0.C5975S;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p736f0.C13489g;

/* JADX INFO: renamed from: Nf.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C5733o extends AbstractC16546n implements InterfaceC1441p {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f18614Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18615Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ List f18616o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f18617p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f18618q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ MessagesViewModel f18619r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ List f18620s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC5985X f18621t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5733o(String str, String str2, List list, List list2, List list3, MessagesViewModel messagesViewModel, List list4, InterfaceC5985X interfaceC5985X) {
        super(4);
        this.f18614Y = str;
        this.f18615Z = str2;
        this.f18616o0 = list;
        this.f18617p0 = list2;
        this.f18618q0 = list3;
        this.f18619r0 = messagesViewModel;
        this.f18620s0 = list4;
        this.f18621t0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1441p
    /* JADX INFO: renamed from: d */
    public final Object mo985d(Object obj, Object obj2, Object obj3, Object obj4) throws Exception {
        C13489g AnimatedContent = (C13489g) obj;
        EnumC5742x mode = (EnumC5742x) obj2;
        C6021p c6021p = (C6021p) obj3;
        ((Number) obj4).intValue();
        AbstractC16544l.m18094g(AnimatedContent, "$this$AnimatedContent");
        AbstractC16544l.m18094g(mode, "mode");
        int iOrdinal = mode.ordinal();
        C5975S c5975s = C6013l.f19514a;
        MessagesViewModel messagesViewModel = this.f18619r0;
        InterfaceC5985X interfaceC5985X = this.f18621t0;
        if (iOrdinal == 0) {
            c6021p.m6524S(-39756197);
            float f10 = AbstractC5741w.f18690a;
            Map map = (Map) interfaceC5985X.getValue();
            c6021p.m6524S(-39746707);
            boolean zM6542f = c6021p.m6542f(messagesViewModel);
            String str = this.f18615Z;
            boolean zM6542f2 = zM6542f | c6021p.m6542f(str);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f2 || objM6514H == c5975s) {
                objM6514H = new C5034f(messagesViewModel, 6, str);
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            List list = this.f18616o0;
            List list2 = this.f18617p0;
            AbstractC5741w.m6162e(this.f18614Y, this.f18615Z, list, list2, this.f18618q0, map, (InterfaceC1436k) objM6514H, null, c6021p, 0);
            c6021p.m6553p(false);
        } else if (iOrdinal != 1) {
            c6021p.m6524S(-1231226657);
            c6021p.m6553p(false);
        } else {
            c6021p.m6524S(-39725970);
            float f11 = AbstractC5741w.f18690a;
            Map map2 = (Map) interfaceC5985X.getValue();
            c6021p.m6524S(-39719301);
            boolean zM6542f3 = c6021p.m6542f(messagesViewModel);
            Object objM6514H2 = c6021p.m6514H();
            if (zM6542f3 || objM6514H2 == c5975s) {
                C0292u c0292u = new C0292u(1, messagesViewModel, MessagesViewModel.class, "processIntent", "processIntent(Lcom/openai/viewmodel/Intent;)V", 0, 13);
                c6021p.m6537c0(c0292u);
                objM6514H2 = c0292u;
            }
            c6021p.m6553p(false);
            String str2 = this.f18615Z;
            AbstractC5741w.m6160c(this.f18614Y, str2, this.f18620s0, map2, (InterfaceC1436k) ((InterfaceC3759g) objM6514H2), null, c6021p, 0);
            c6021p.m6553p(false);
        }
        return C17296C.f55119a;
    }
}
