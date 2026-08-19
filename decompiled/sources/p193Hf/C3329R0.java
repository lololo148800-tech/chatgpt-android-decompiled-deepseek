package p193Hf;

import com.auth0.android.result.Credentials;
import com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModel;
import java.util.List;
import mm.C17296C;
import p002A0.C0130g;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p086D6.C1971o;
import p103Dn.C2219z0;
import p349O0.C5997d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hf.R0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3329R0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10167Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Credentials f10168Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f10169o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f10170p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f10171q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ boolean f10172r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean f10173s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ C3337V0 f10174t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ CanmoreViewModel f10175u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ List f10176v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3329R0(Credentials credentials, String str, String str2, boolean z6, boolean z10, boolean z11, C3337V0 c3337v0, CanmoreViewModel canmoreViewModel, List list, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10168Z = credentials;
        this.f10169o0 = str;
        this.f10170p0 = str2;
        this.f10171q0 = z6;
        this.f10172r0 = z10;
        this.f10173s0 = z11;
        this.f10174t0 = c3337v0;
        this.f10175u0 = canmoreViewModel;
        this.f10176v0 = list;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        CanmoreViewModel canmoreViewModel = this.f10175u0;
        List list = this.f10176v0;
        return new C3329R0(this.f10168Z, this.f10169o0, this.f10170p0, this.f10171q0, this.f10172r0, this.f10173s0, this.f10174t0, canmoreViewModel, list, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3329R0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String idToken;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10167Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Credentials credentials = this.f10168Z;
            if (credentials != null && (idToken = credentials.getIdToken()) != null) {
                String accessToken = credentials.getAccessToken();
                boolean z6 = this.f10171q0;
                boolean z10 = this.f10172r0;
                String str = "/c/" + this.f10169o0 + "/canmore/" + this.f10170p0 + "?readonly=" + ((z6 && z10 && !this.f10173s0) ? false : true) + "&header=" + z10 + "&isFullScreen=" + z10 + "&native_bridge_version=1";
                C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C0130g(this.f10174t0, 28));
                C3328Q0 c3328q0 = new C3328Q0(this.f10172r0, this.f10175u0, accessToken, idToken, str, this.f10176v0);
                this.f10167Y = 1;
                Object objMo3141d = c2219z0M6441a0.mo3141d(new C1971o(c3328q0, 3), this);
                if (objMo3141d != enumC19250a) {
                    objMo3141d = c17296c;
                }
                if (objMo3141d == enumC19250a) {
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
