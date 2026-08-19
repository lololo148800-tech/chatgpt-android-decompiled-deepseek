package com.withpersona.sdk2.inquiry.internal;

import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager;
import com.withpersona.sdk2.inquiry.InquiryActivityEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p077Cn.C1743k;
import p1033u5.C20118c;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2121A0;
import p103Dn.InterfaceC2186j;
import p117Eb.C2385o;
import p222Ij.C3739d;
import p247Jj.C4456t;
import p259K5.C4544f;
import p385Pj.C6427b;
import p523V9.AbstractC8017W3;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p770gk.C14187c;
import p841k.C16288h;
import p859l.C16653d;
import p864l5.C16826m;
import p864l5.InterfaceC16818e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/S;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/S;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryViewModel extends ViewModel {

    /* JADX INFO: renamed from: b */
    public final C11082S f40708b;

    /* JADX INFO: renamed from: c */
    public C4456t f40709c;

    /* JADX INFO: renamed from: d */
    public C2153Q0 f40710d;

    /* JADX INFO: renamed from: e */
    public final C1743k f40711e;

    /* JADX INFO: renamed from: f */
    public final C14187c f40712f;

    /* JADX INFO: renamed from: g */
    public final C2127D0 f40713g;

    /* JADX INFO: renamed from: h */
    public final C2153Q0 f40714h;

    /* JADX INFO: renamed from: i */
    public final C2127D0 f40715i;

    /* JADX INFO: renamed from: j */
    public final C16288h f40716j;

    /* JADX INFO: renamed from: k */
    public final C16288h f40717k;

    /* JADX INFO: renamed from: l */
    public final C16288h f40718l;

    /* JADX INFO: renamed from: m */
    public final C16288h f40719m;

    /* JADX INFO: renamed from: n */
    public final C16288h f40720n;

    /* JADX INFO: renamed from: o */
    public final C16288h f40721o;

    /* JADX INFO: renamed from: p */
    public final C16288h f40722p;

    /* JADX INFO: renamed from: q */
    public final C16288h f40723q;

    /* JADX INFO: renamed from: r */
    public final C17314q f40724r;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1 */
    @InterfaceC19689e(m20655c = "com.withpersona.sdk2.inquiry.internal.InquiryViewModel$1", m20656f = "InquiryViewModel.kt", m20657l = {86}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    public static final class C128611 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f40725Y;

        public C128611(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return InquiryViewModel.this.new C128611(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            ((C128611) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            return EnumC19250a.f61036Y;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40725Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC2121A0 eventFlow = InquiryActivityBroadcastManager.INSTANCE.getEventFlow();
                final InquiryViewModel inquiryViewModel = InquiryViewModel.this;
                InterfaceC2186j interfaceC2186j = new InterfaceC2186j() { // from class: com.withpersona.sdk2.inquiry.internal.InquiryViewModel.1.1
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj2, InterfaceC18770c interfaceC18770c) {
                        if (((InquiryActivityEvent) obj2) instanceof InquiryActivityEvent.CancelInquiry) {
                            InquiryViewModel inquiryViewModel2 = inquiryViewModel;
                            inquiryViewModel2.getClass();
                            AbstractC0575H.m1156D(ViewModelKt.m12143a(inquiryViewModel2), AbstractC0593T.f1824a, null, new InquiryViewModel$cancelInquiry$1(inquiryViewModel2, null), 2);
                        }
                        return C17296C.f55119a;
                    }
                };
                this.f40725Y = 1;
                if (eventFlow.mo3141d(interfaceC2186j, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            throw new C0644w();
        }
    }

    public InquiryViewModel(C11082S savedStateHandle) {
        AbstractC16544l.m18094g(savedStateHandle, "savedStateHandle");
        this.f40708b = savedStateHandle;
        this.f40711e = AbstractC8017W3.m8337a(0, 7, null);
        this.f40712f = new C14187c(savedStateHandle);
        this.f40713g = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f40714h = AbstractC2124C.m3204c(new C3739d(false, false, true));
        this.f40715i = AbstractC2124C.m3203b(0, 0, null, 7);
        this.f40716j = new C16288h(new C2385o(28), new C6427b(8));
        this.f40717k = new C16288h(new C2385o(25), new C6427b(9));
        int i10 = Build.VERSION.SDK_INT;
        this.f40718l = new C16288h(new C2385o(23), new C16653d((i10 < 33 && (i10 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit()));
        this.f40719m = new C16288h(new C2385o(24), new C6427b(4));
        this.f40720n = new C16288h(new C2385o(27), new C6427b(6));
        this.f40721o = new C16288h(new C2385o(26), new C6427b(3));
        this.f40722p = new C16288h(new C2385o(29), new C6427b(1));
        this.f40723q = new C16288h(new C2385o(22), new C6427b(0));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), AbstractC0593T.f1824a, null, new C128611(null), 2);
        this.f40724r = AbstractC9227W.m9800c(new InquiryViewModel$renderings$2(this));
    }

    /* JADX INFO: renamed from: f */
    public final void m14535f() {
        InterfaceC16818e interfaceC16818e;
        C4456t c4456t = this.f40709c;
        if (c4456t == null || (interfaceC16818e = (InterfaceC16818e) c4456t.f14576x.get()) == null) {
            return;
        }
        C16826m c16826m = (C16826m) interfaceC16818e;
        if (c16826m.f53997j.getAndSet(true)) {
            return;
        }
        AbstractC0575H.m1180i(c16826m.f53992e, null);
        c16826m.f53993f.m1018b();
        C20118c c20118c = (C20118c) c16826m.f53990c.getValue();
        if (c20118c != null) {
            c20118c.f63742a.mo14952A();
            C4544f c4544f = c20118c.f63743b;
            synchronized (c4544f) {
                c4544f.f14854b = 0;
                c4544f.f14853a.clear();
            }
        }
    }
}
