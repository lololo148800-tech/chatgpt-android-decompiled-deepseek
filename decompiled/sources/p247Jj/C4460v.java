package p247Jj;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import dj.AbstractC13178c;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p342Nj.EnumC5812f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Jj.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C4460v extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f14590Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4466y f14591Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f14592o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InternalErrorInfo f14593p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4460v(C4466y c4466y, String str, InternalErrorInfo internalErrorInfo, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f14591Z = c4466y;
        this.f14592o0 = str;
        this.f14593p0 = internalErrorInfo;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C4460v(this.f14591Z, this.f14592o0, this.f14593p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4460v) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC5812f enumC5812f;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f14590Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C4466y c4466y = this.f14591Z;
            InternalErrorInfo internalErrorInfo = this.f14593p0;
            AbstractC16544l.m18094g(internalErrorInfo, "<this>");
            if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
                enumC5812f = EnumC5812f.Network;
            } else if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
                enumC5812f = EnumC5812f.Other;
            } else if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                enumC5812f = EnumC5812f.Permissions;
            } else if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
                enumC5812f = EnumC5812f.Camera;
            } else {
                if (!(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo)) {
                    throw new C0644w();
                }
                enumC5812f = EnumC5812f.Other;
            }
            C11447L c11447l = c4466y.f14605b;
            c11447l.getClass();
            ErrorRequest errorRequest = new ErrorRequest(enumC5812f, c11447l.m12850b(InternalErrorInfo.class, AbstractC13178c.f41820a, null).toJsonValue(internalErrorInfo));
            this.f14590Y = 1;
            if (c4466y.f14604a.m6214g(this.f14592o0, errorRequest, this) == enumC19250a) {
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
