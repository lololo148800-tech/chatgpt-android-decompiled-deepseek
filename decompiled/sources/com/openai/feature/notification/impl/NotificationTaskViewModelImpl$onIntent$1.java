package com.openai.feature.notification.impl;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.Map;
import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1081wc.C20878Y;
import p1155zi.C22072w1;
import p1155zi.EnumC22040o1;
import p455Sf.C7127l;
import p455Sf.C7129n;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.notification.impl.NotificationTaskViewModelImpl$onIntent$1", m20656f = "NotificationTaskViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class NotificationTaskViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39012Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ NotificationTaskViewModelImpl f39013Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7127l f39014o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationTaskViewModelImpl$onIntent$1(NotificationTaskViewModelImpl notificationTaskViewModelImpl, C7127l c7127l, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39013Z = notificationTaskViewModelImpl;
        this.f39014o0 = c7127l;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new NotificationTaskViewModelImpl$onIntent$1(this.f39013Z, this.f39014o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((NotificationTaskViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC22040o1 enumC22040o1;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39012Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            NotificationTaskViewModelImpl notificationTaskViewModelImpl = this.f39013Z;
            C22072w1 c22072w1 = ((C7129n) notificationTaskViewModelImpl.m14391f()).f22685a;
            if (c22072w1 != null && (enumC22040o1 = c22072w1.f69785b) != null) {
                C20878Y c20878y = C20878Y.f66490c;
                C17309l c17309l = new C17309l("category", enumC22040o1.f69729Y);
                C7127l c7127l = this.f39014o0;
                notificationTaskViewModelImpl.f39010j.mo21447a(c20878y, AbstractC17659D.m19244f(c17309l, new C17309l("channel", c7127l.f22679a.f69759Y), new C17309l("enabled", String.valueOf(c7127l.f22680b))));
                Map mapM19258c = AbstractC17660E.m19258c(new C17309l(c7127l.f22679a, Boolean.valueOf(c7127l.f22680b)));
                this.f39012Y = 1;
                if (notificationTaskViewModelImpl.f39009i.m7798d(enumC22040o1, mapM19258c, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
