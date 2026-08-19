package com.openai.feature.jawbone.impl.tools;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import gd.C13974p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1081wc.C20869O;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p324Mn.C5551u;
import p505Uf.C7638A;
import p523V9.AbstractC8128k6;
import p571X9.AbstractC9233X;
import p854kf.C16389g;
import p854kf.C16390h;
import p891mf.C17245f;
import p891mf.C17247h;
import p891mf.InterfaceC17246g;
import p896n2.AbstractC17458k;
import p896n2.C17469v;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl$onIntent$3", m20656f = "JawboneToolViewModelImpl.kt", m20657l = {101, 112}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class JawboneToolViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38462Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ JawboneToolViewModelImpl f38463Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17246g f38464o0;

    /* JADX INFO: renamed from: com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl$onIntent$3$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmf/h;", "invoke", "(Lmf/h;)Lmf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123881 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123881 f38465Y = new C123881();

        public C123881() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17247h setState = (C17247h) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17247h.m18969e(setState, null, null, true, 7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JawboneToolViewModelImpl$onIntent$3(JawboneToolViewModelImpl jawboneToolViewModelImpl, InterfaceC17246g interfaceC17246g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38463Z = jawboneToolViewModelImpl;
        this.f38464o0 = interfaceC17246g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new JawboneToolViewModelImpl$onIntent$3(this.f38463Z, this.f38464o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((JawboneToolViewModelImpl$onIntent$3) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        NotificationChannel notificationChannelM19140b;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38462Y;
        C17296C c17296c = C17296C.f55119a;
        JawboneToolViewModelImpl jawboneToolViewModelImpl = this.f38463Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C7638A c7638a = ((C17245f) this.f38464o0).f55024a;
        jawboneToolViewModelImpl.getClass();
        String str = c7638a.f24149a.f24159Y;
        Uri uri = Settings.System.DEFAULT_NOTIFICATION_URI;
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        C17469v c17469v = new C17469v(jawboneToolViewModelImpl.f38439m);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            notificationChannelM19140b = null;
        } else {
            notificationChannelM19140b = AbstractC17458k.m19140b(c7638a.f24151c, c7638a.f24150b, str);
            AbstractC17458k.m19145g(notificationChannelM19140b);
            AbstractC17458k.m19146h(notificationChannelM19140b);
            AbstractC17458k.m19151m(notificationChannelM19140b);
            AbstractC17458k.m19152n(notificationChannelM19140b, uri, audioAttributes);
            AbstractC17458k.m19142d(notificationChannelM19140b);
            AbstractC17458k.m19148j(notificationChannelM19140b);
            AbstractC17458k.m19154p(notificationChannelM19140b);
            AbstractC17458k.m19143e(notificationChannelM19140b);
        }
        if (i11 >= 26) {
            AbstractC17458k.m19141c(c17469v.f55844a, notificationChannelM19140b);
        }
        this.f38462Y = 1;
        obj = jawboneToolViewModelImpl.f38435i.m17973c(this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C5551u c5551u = (C5551u) obj;
        if (c5551u != null) {
            C5551u c5551uM5929a = jawboneToolViewModelImpl.f38438l.m5929a();
            C21554a c21554a = C21555b.f68260Z;
            if (c5551u.compareTo(c5551uM5929a.m5947c(C21555b.m21843m(AbstractC8128k6.m8644j(((Number) jawboneToolViewModelImpl.f38440n.m15477a(C13974p.f44032d)).intValue(), EnumC21557d.HOURS)))) < 0) {
                jawboneToolViewModelImpl.f38441o.mo21447a(C20869O.f66436e, C17690x.f56481Y);
                jawboneToolViewModelImpl.m14397m(C123881.f38465Y);
                C5551u c5551uM5929a2 = jawboneToolViewModelImpl.f38438l.m5929a();
                this.f38462Y = 2;
                C16390h c16390h = jawboneToolViewModelImpl.f38435i;
                c16390h.getClass();
                c16390h.f50900b.m21030c(new C16389g(0, c5551uM5929a2));
                if (c17296c == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            jawboneToolViewModelImpl.f38441o.mo21447a(C20869O.f66436e, C17690x.f56481Y);
            jawboneToolViewModelImpl.m14397m(C123881.f38465Y);
            C5551u c5551uM5929a3 = jawboneToolViewModelImpl.f38438l.m5929a();
            this.f38462Y = 2;
            C16390h c16390h2 = jawboneToolViewModelImpl.f38435i;
            c16390h2.getClass();
            c16390h2.f50900b.m21030c(new C16389g(0, c5551uM5929a3));
            if (c17296c == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }
}
