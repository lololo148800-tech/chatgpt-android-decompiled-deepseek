package com.openai.feature.settings.impl.settings;

import bo.C11527o;
import com.auth0.android.result.Credentials;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2054c;
import p098Di.C2060i;
import p1149zc.AbstractC21864z;
import p1149zc.C21837F;
import p571X9.AbstractC9233X;
import p817j$.util.DateRetargetClass;
import p905nd.C17589q;
import p929oi.AbstractC18201b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sl.AbstractC19667b;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.settings.SettingsViewModelImpl$onIntent$5", m20656f = "SettingsViewModel.kt", m20657l = {227}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SettingsViewModelImpl$onIntent$5 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39743Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SettingsViewModelImpl f39744Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModelImpl$onIntent$5(SettingsViewModelImpl settingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39744Z = settingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SettingsViewModelImpl$onIntent$5(this.f39744Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SettingsViewModelImpl$onIntent$5) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39743Y;
        SettingsViewModelImpl settingsViewModelImpl = this.f39744Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC21864z abstractC21864z = settingsViewModelImpl.f39722m;
            this.f39743Y = 1;
            obj = ((C17589q) abstractC21864z).m19219e(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        Credentials credentials = (Credentials) obj;
        if (credentials == null) {
            settingsViewModelImpl.m14393h(new C2060i("No credentials to copy"));
        } else {
            C11527o c11527o = AbstractC18201b.f58034a;
            C21837F c21837f = new C21837F(credentials.getAccessToken(), credentials.getIdToken(), credentials.getType(), credentials.getRefreshToken(), DateRetargetClass.toInstant(credentials.getExpiresAt()).toEpochMilli(), credentials.getScope());
            c11527o.getClass();
            settingsViewModelImpl.m14393h(new C2054c(AbstractC19667b.m20646b(c11527o.m12905d(C21837F.Companion.serializer(), c21837f))));
        }
        return C17296C.f55119a;
    }
}
