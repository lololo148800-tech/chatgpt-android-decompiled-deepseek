package com.openai.feature.conversations.impl.input;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p1025te.C19863N;
import p1025te.C19874e;
import p1025te.C19875f;
import p1025te.C19876g;
import p1025te.C19877h;
import p1025te.InterfaceC19878i;
import p1081wc.C20859E;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.EnumC21968V0;
import p1155zi.InterfaceC21915G;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.C17690x;
import p967qh.C18712b;
import p967qh.C18713c;
import p967qh.C18714d;
import p967qh.C18715e;
import p967qh.C18716f;
import p967qh.InterfaceC18717g;
import p972qm.InterfaceC18770c;
import p991rh.EnumC18991F;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.EnumC21517f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$uploadFile$1", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqh/g;", "progress", "Lmm/C;", "<anonymous>", "(Lqh/g;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$uploadFile$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f37986Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC18991F f37987Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC21968V0 f37988o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InputViewModelImpl f37989p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Uri f37990q0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$uploadFile$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123401 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ Uri f37991Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C19874e f37992Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123401(Uri uri, C19874e c19874e) {
            super(1);
            this.f37991Y = uri;
            this.f37992Z = c19874e;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            return C19863N.m20780a(update, null, false, AbstractC17659D.m19249k(update.f62956c, new C17309l(this.f37991Y, this.f37992Z)), null, false, null, null, null, 251);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$uploadFile$1(EnumC18991F enumC18991F, EnumC21968V0 enumC21968V0, InputViewModelImpl inputViewModelImpl, Uri uri, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37987Z = enumC18991F;
        this.f37988o0 = enumC21968V0;
        this.f37989p0 = inputViewModelImpl;
        this.f37990q0 = uri;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        InputViewModelImpl$uploadFile$1 inputViewModelImpl$uploadFile$1 = new InputViewModelImpl$uploadFile$1(this.f37987Z, this.f37988o0, this.f37989p0, this.f37990q0, interfaceC18770c);
        inputViewModelImpl$uploadFile$1.f37986Y = obj;
        return inputViewModelImpl$uploadFile$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        InputViewModelImpl$uploadFile$1 inputViewModelImpl$uploadFile$1 = (InputViewModelImpl$uploadFile$1) create((InterfaceC18717g) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        inputViewModelImpl$uploadFile$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC19878i c19877h;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC18717g interfaceC18717g = (InterfaceC18717g) this.f37986Y;
        boolean z6 = interfaceC18717g instanceof C18714d;
        InputViewModelImpl inputViewModelImpl = this.f37989p0;
        if (z6) {
            c19877h = new C19877h(null);
        } else if (interfaceC18717g instanceof C18715e) {
            c19877h = new C19877h(new Float(((C18715e) interfaceC18717g).f59549a));
        } else if (interfaceC18717g instanceof C18716f) {
            c19877h = new C19877h(null);
        } else {
            boolean z10 = interfaceC18717g instanceof C18712b;
            InterfaceC19878i c19876g = C19875f.f63016a;
            if (z10) {
                AbstractC21955Q1 abstractC21955Q1 = ((C18712b) interfaceC18717g).f59546a;
                boolean z11 = abstractC21955Q1 instanceof C21952P1;
                C20859E c20859e = C20859E.f66354h;
                if (z11) {
                    InterfaceC21915G interfaceC21915G = (InterfaceC21915G) ((C21952P1) abstractC21955Q1).f69511a;
                    inputViewModelImpl.f37890r.mo21447a(c20859e, C17690x.f56481Y);
                    if (interfaceC21915G != null) {
                        c19876g = new C19876g(interfaceC21915G);
                    }
                } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    inputViewModelImpl.f37890r.mo21447a(C20859E.f66355i, C17690x.f56481Y);
                    inputViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
                } else {
                    if (!(abstractC21955Q1 instanceof C21929J1)) {
                        throw new C0644w();
                    }
                    inputViewModelImpl.f37890r.mo21447a(c20859e, C17690x.f56481Y);
                }
            } else if (!(interfaceC18717g instanceof C18713c)) {
                throw new C0644w();
            }
            c19877h = c19876g;
        }
        inputViewModelImpl.f37883k.m20781a(new C123401(this.f37990q0, new C19874e(this.f37987Z, this.f37988o0, c19877h)));
        if (!((C19863N) inputViewModelImpl.f37883k.f62964c.getValue()).f62956c.isEmpty()) {
            inputViewModelImpl.f37889q.m19711b(EnumC21517f.f68138Z);
        }
        return C17296C.f55119a;
    }
}
