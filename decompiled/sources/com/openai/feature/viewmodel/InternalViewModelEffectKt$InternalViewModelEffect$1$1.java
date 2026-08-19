package com.openai.feature.viewmodel;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.navigation.AbstractC11122c;
import com.openai.viewmodel.BaseViewModel;
import kotlin.Metadata;
import mm.C17296C;
import p003A1.C0256i;
import p003A1.InterfaceC0172H0;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p098Di.C2054c;
import p098Di.C2055d;
import p098Di.C2056e;
import p098Di.C2057f;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.C2060i;
import p098Di.InterfaceC2061j;
import p103Dn.AbstractC2124C;
import p103Dn.C2174d;
import p1155zi.AbstractC21933K1;
import p204I1.C3590f;
import p318Mh.AbstractC5364G0;
import p553Wh.C8870f;
import p571X9.AbstractC9209T;
import p571X9.AbstractC9231W3;
import p571X9.AbstractC9233X;
import p893n.AbstractActivityC17375g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.viewmodel.InternalViewModelEffectKt$InternalViewModelEffect$1$1", m20656f = "InternalViewModelEffect.kt", m20657l = {31}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"LDi/a;", TokenNames.f32010E, "LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InternalViewModelEffectKt$InternalViewModelEffect$1$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39931Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BaseViewModel f39932Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractActivityC17375g f39933o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8870f f39934p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ ClipboardManager f39935q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ InterfaceC0172H0 f39936r0;

    /* JADX INFO: renamed from: com.openai.feature.viewmodel.InternalViewModelEffectKt$InternalViewModelEffect$1$1$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.viewmodel.InternalViewModelEffectKt$InternalViewModelEffect$1$1$1", m20656f = "InternalViewModelEffect.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LDi/a;", TokenNames.f32010E, "LDi/j;", "effect", "Lmm/C;", "<anonymous>", "(LDi/j;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125231 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39937Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ AbstractActivityC17375g f39938Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C8870f f39939o0;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ ClipboardManager f39940p0;

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ InterfaceC0172H0 f39941q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125231(AbstractActivityC17375g abstractActivityC17375g, C8870f c8870f, ClipboardManager clipboardManager, InterfaceC0172H0 interfaceC0172H0, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39938Z = abstractActivityC17375g;
            this.f39939o0 = c8870f;
            this.f39940p0 = clipboardManager;
            this.f39941q0 = interfaceC0172H0;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125231 c125231 = new C125231(this.f39938Z, this.f39939o0, this.f39940p0, this.f39941q0, interfaceC18770c);
            c125231.f39937Y = obj;
            return c125231;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C125231 c125231 = (C125231) create((InterfaceC2061j) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c125231.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            ClipboardManager clipboardManager;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            InterfaceC2061j interfaceC2061j = (InterfaceC2061j) this.f39937Y;
            boolean z6 = interfaceC2061j instanceof C2055d;
            C8870f c8870f = this.f39939o0;
            if (z6) {
                AbstractC9209T.m9776b(this.f39938Z, c8870f, ((C2055d) interfaceC2061j).f6276a);
            } else if (interfaceC2061j instanceof C2058g) {
                C2058g c2058g = (C2058g) interfaceC2061j;
                AbstractC5364G0.m5889d(c8870f.f27149b, c2058g.f6280a, c2058g.f6281b);
            } else if (interfaceC2061j instanceof C2057f) {
                C2057f c2057f = (C2057f) interfaceC2061j;
                AbstractC11122c.m12180q(c8870f.f27149b, c2057f.f6278a, c2057f.f6279b);
            } else if (interfaceC2061j instanceof C2056e) {
                c8870f.f27149b.m12195o();
            } else if (interfaceC2061j instanceof C2059h) {
                C2059h c2059h = (C2059h) interfaceC2061j;
                String strM9804b = c2059h.f6283b;
                if (strM9804b == null) {
                    AbstractC21933K1 abstractC21933K1 = c2059h.f6282a;
                    strM9804b = abstractC21933K1 != null ? AbstractC9231W3.m9804b(abstractC21933K1, c8870f.f27152e, c8870f.f27148a) : null;
                }
                if (strM9804b != null) {
                    C8870f.m9548c(c8870f, strM9804b, null, 14);
                }
            } else if (interfaceC2061j instanceof C2060i) {
                C2060i c2060i = (C2060i) interfaceC2061j;
                String strM3160b = c2060i.f6284a;
                if (strM3160b == null) {
                    Integer num = c2060i.f6285b;
                    strM3160b = num != null ? c8870f.f27152e.m3160b(num.intValue()) : null;
                }
                if (strM3160b != null) {
                    C8870f.m9548c(c8870f, strM3160b, null, 14);
                }
            } else if (interfaceC2061j instanceof C2054c) {
                C2054c c2054c = (C2054c) interfaceC2061j;
                String str = c2054c.f6275b;
                C3590f c3590f = c2054c.f6274a;
                if (str == null || (clipboardManager = this.f39940p0) == null) {
                    ((C0256i) this.f39941q0).m827c(c3590f);
                } else {
                    clipboardManager.setPrimaryClip(ClipData.newHtmlText("Copied text", c3590f.f10934Y, str));
                }
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalViewModelEffectKt$InternalViewModelEffect$1$1(BaseViewModel baseViewModel, AbstractActivityC17375g abstractActivityC17375g, C8870f c8870f, ClipboardManager clipboardManager, InterfaceC0172H0 interfaceC0172H0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39932Z = baseViewModel;
        this.f39933o0 = abstractActivityC17375g;
        this.f39934p0 = c8870f;
        this.f39935q0 = clipboardManager;
        this.f39936r0 = interfaceC0172H0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new InternalViewModelEffectKt$InternalViewModelEffect$1$1(this.f39932Z, this.f39933o0, this.f39934p0, this.f39935q0, this.f39936r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((InternalViewModelEffectKt$InternalViewModelEffect$1$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39931Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2174d c2174d = this.f39932Z.f40348h;
            C125231 c125231 = new C125231(this.f39933o0, this.f39934p0, this.f39935q0, this.f39936r0, null);
            this.f39931Y = 1;
            if (AbstractC2124C.m3212k(c2174d, c125231, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
