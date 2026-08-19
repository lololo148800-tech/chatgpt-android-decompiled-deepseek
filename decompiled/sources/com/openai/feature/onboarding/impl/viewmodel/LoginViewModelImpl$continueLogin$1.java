package com.openai.feature.onboarding.impl.viewmodel;

import android.content.Context;
import android.content.Intent;
import com.openai.chatgpt.R;
import ec.AbstractC13361c;
import ga.C13834b;
import kotlin.Metadata;
import mm.C17296C;
import p025An.C0564B0;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p044Bh.C1300m;
import p049Bm.InterfaceC1439n;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21949O1;
import p1155zi.C21952P1;
import p229J0.EnumC3898D3;
import p523V9.AbstractC8226x0;
import p571X9.AbstractC9233X;
import p623Zf.C10314j;
import p948pi.C18426i;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.LoginViewModelImpl$continueLogin$1", m20656f = "LoginViewModelImpl.kt", m20657l = {144, 145, 147, 179}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class LoginViewModelImpl$continueLogin$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39173Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ LoginViewModelImpl f39174Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f39175o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC13361c f39176p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C13834b f39177q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModelImpl$continueLogin$1(LoginViewModelImpl loginViewModelImpl, Context context, AbstractC13361c abstractC13361c, C13834b c13834b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39174Z = loginViewModelImpl;
        this.f39175o0 = context;
        this.f39176p0 = abstractC13361c;
        this.f39177q0 = c13834b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new LoginViewModelImpl$continueLogin$1(this.f39174Z, this.f39175o0, this.f39176p0, this.f39177q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginViewModelImpl$continueLogin$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0066, please report this as an issue */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC21955Q1 abstractC21955Q1;
        boolean z6;
        AbstractC13361c abstractC13361c;
        LoginViewModelImpl loginViewModelImpl;
        Context context;
        C13834b c13834b;
        AbstractC21933K1 abstractC21933K1;
        C21949O1 c21949o1;
        String str;
        String strM8862c;
        C10314j c10314j;
        String str2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39173Y;
        LoginViewModelImpl loginViewModelImpl2 = this.f39174Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                abstractC21955Q1 = (AbstractC21955Q1) obj;
                z6 = abstractC21955Q1 instanceof C21952P1;
                abstractC13361c = this.f39176p0;
                loginViewModelImpl = this.f39174Z;
                context = this.f39175o0;
                c13834b = this.f39177q0;
                if (z6) {
                    str2 = ((C18426i) ((C21952P1) abstractC21955Q1).f69511a).f58788a;
                    this.f39173Y = 3;
                    if (LoginViewModelImpl.m14329p(loginViewModelImpl, context, abstractC13361c, c13834b, str2, null, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                    abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                    if (abstractC21933K1 instanceof C21949O1) {
                        c21949o1 = (C21949O1) abstractC21933K1;
                    } else {
                        c21949o1 = null;
                    }
                    str = c21949o1 != null ? c21949o1.f69508d : null;
                    if (str != null) {
                        LoginViewModelImpl$continueLogin$1$2$1 loginViewModelImpl$continueLogin$1$2$1 = LoginViewModelImpl$continueLogin$1$2$1.f39178Y;
                        Intent intent = LoginViewModelImpl.f39158r;
                        loginViewModelImpl.m14397m(loginViewModelImpl$continueLogin$1$2$1);
                        if (abstractC21933K1.f69485a instanceof C1300m) {
                            c10314j = new C10314j(str, EnumC3898D3.f11879o0, loginViewModelImpl.f39162l.m3160b(R.string.onboarding_error_action_label), LoginViewModelImpl.f39158r);
                        } else {
                            c10314j = new C10314j(str, EnumC3898D3.f11878Z, 12);
                        }
                        loginViewModelImpl.m14392g(c10314j);
                    } else {
                        strM8862c = AbstractC8226x0.m8862c(abstractC21933K1);
                        this.f39173Y = 4;
                        if (LoginViewModelImpl.m14329p(loginViewModelImpl, context, abstractC13361c, c13834b, null, strM8862c, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
            } else {
                if (i10 != 3 && i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C0564B0 c0564b0 = loginViewModelImpl2.f39167q;
        this.f39173Y = 1;
        if (c0564b0.mo1272P(this) == enumC19250a) {
            return enumC19250a;
        }
        this.f39173Y = 2;
        obj = LoginViewModelImpl.m14328o(loginViewModelImpl2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) obj;
        z6 = abstractC21955Q1 instanceof C21952P1;
        abstractC13361c = this.f39176p0;
        loginViewModelImpl = this.f39174Z;
        context = this.f39175o0;
        c13834b = this.f39177q0;
        if (z6) {
            str2 = ((C18426i) ((C21952P1) abstractC21955Q1).f69511a).f58788a;
            this.f39173Y = 3;
            if (LoginViewModelImpl.m14329p(loginViewModelImpl, context, abstractC13361c, c13834b, str2, null, this) == enumC19250a) {
                return enumC19250a;
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            if (abstractC21933K1 instanceof C21949O1) {
                c21949o1 = (C21949O1) abstractC21933K1;
            } else {
                c21949o1 = null;
            }
            if (c21949o1 != null) {
            }
            if (str != null) {
                LoginViewModelImpl$continueLogin$1$2$1 loginViewModelImpl$continueLogin$1$2$2 = LoginViewModelImpl$continueLogin$1$2$1.f39178Y;
                Intent intent2 = LoginViewModelImpl.f39158r;
                loginViewModelImpl.m14397m(loginViewModelImpl$continueLogin$1$2$2);
                if (abstractC21933K1.f69485a instanceof C1300m) {
                    c10314j = new C10314j(str, EnumC3898D3.f11879o0, loginViewModelImpl.f39162l.m3160b(R.string.onboarding_error_action_label), LoginViewModelImpl.f39158r);
                } else {
                    c10314j = new C10314j(str, EnumC3898D3.f11878Z, 12);
                }
                loginViewModelImpl.m14392g(c10314j);
            } else {
                strM8862c = AbstractC8226x0.m8862c(abstractC21933K1);
                this.f39173Y = 4;
                if (LoginViewModelImpl.m14329p(loginViewModelImpl, context, abstractC13361c, c13834b, null, strM8862c, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }
}
