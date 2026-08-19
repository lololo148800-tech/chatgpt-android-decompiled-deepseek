package com.openai.feature.notification.impl;

import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p481Tf.C7409n;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.notification.impl.NotificationSettingsViewModelImpl$getNotificationSettings$1", m20656f = "NotificationSettingsViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class NotificationSettingsViewModelImpl$getNotificationSettings$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39004Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ NotificationSettingsViewModelImpl f39005Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModelImpl$getNotificationSettings$1(NotificationSettingsViewModelImpl notificationSettingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39005Z = notificationSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new NotificationSettingsViewModelImpl$getNotificationSettings$1(this.f39005Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationSettingsViewModelImpl$getNotificationSettings$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39004Y;
        NotificationSettingsViewModelImpl notificationSettingsViewModelImpl = this.f39005Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C7409n c7409n = notificationSettingsViewModelImpl.f39001i;
            this.f39004Y = 1;
            obj = c7409n.m7796b(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(notificationSettingsViewModelImpl.f39002j, "Failed to get notification settings", abstractC21933K1.f69485a, 4);
            notificationSettingsViewModelImpl.m14397m(new NotificationSettingsViewModelImpl$getNotificationSettings$1$1$1(abstractC21933K1));
        }
        return C17296C.f55119a;
    }
}
