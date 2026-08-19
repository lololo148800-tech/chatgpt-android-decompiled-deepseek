package com.openai.feature.oauth.impl;

import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p195Hh.C3430e;
import p318Mh.C5405j;
import p318Mh.C5431w;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p577Xf.C9506e;
import p577Xf.C9508g;
import p577Xf.C9509h;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/oauth/impl/AipOauthViewModelImpl;", "Lcom/openai/feature/oauth/impl/AipOauthViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AipOauthViewModelImpl extends AipOauthViewModel {

    /* JADX INFO: renamed from: i */
    public final C3430e f39019i;

    /* JADX INFO: renamed from: com.openai.feature.oauth.impl.AipOauthViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.oauth.impl.AipOauthViewModelImpl$1", m20656f = "AipOauthViewModel.kt", m20657l = {51}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124471 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f39020Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C9508g f39021Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ String f39022o0;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ Object f39023p0;

        /* JADX INFO: renamed from: q0 */
        public final /* synthetic */ AipOauthViewModelImpl f39024q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124471(C9508g c9508g, String str, Map map, AipOauthViewModelImpl aipOauthViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f39021Z = c9508g;
            this.f39022o0 = str;
            this.f39023p0 = map;
            this.f39024q0 = aipOauthViewModelImpl;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C124471(this.f39021Z, this.f39022o0, this.f39023p0, this.f39024q0, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C124471) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f39020Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f39020Y = 1;
                obj = this.f39021Z.m10025a(this.f39022o0, this.f39023p0, this);
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
            boolean z6 = abstractC21955Q1 instanceof C21952P1;
            String str = null;
            AipOauthViewModelImpl aipOauthViewModelImpl = this.f39024q0;
            if (z6) {
                String str2 = (String) ((C21952P1) abstractC21955Q1).f69511a;
                int i11 = AipOauthViewModelKt.f39031b;
                boolean z10 = false;
                if (str2 != null && AbstractC21329w.m21734u(str2, "/g/", false)) {
                    z10 = true;
                }
                if (z10) {
                    C5431w c5431w = C5431w.f17746g;
                    String strM21704l0 = str2 != null ? AbstractC21322p.m21704l0(str2, "/c/") : null;
                    if (strM21704l0 != null && !strM21704l0.equals(str2) && strM21704l0.length() > 0) {
                        str = strM21704l0;
                    }
                    aipOauthViewModelImpl.m14393h(new C2058g(str == null ? C5431w.m5902f(c5431w, null, null, false, false, 15) : c5431w.m5903d(str), true));
                } else if (str2 != null) {
                    str = AbstractC21322p.m21681O(str2) ? null : str2;
                    if (str != null) {
                        try {
                            aipOauthViewModelImpl.m14393h(new C2058g(str, true));
                        } catch (IllegalArgumentException e10) {
                            AbstractC8160o6.m8727b(aipOauthViewModelImpl.f39019i, "Failed to navigate to ".concat(str), e10, 4);
                            aipOauthViewModelImpl.m14392g(C9506e.f28625a);
                        }
                    }
                }
            } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
                aipOauthViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
                aipOauthViewModelImpl.m14394i(new AipOauthViewModelImpl$1$2$1(aipOauthViewModelImpl, null));
            } else {
                if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
                int i12 = AipOauthViewModelKt.f39031b;
            }
            return C17296C.f55119a;
        }
    }

    public AipOauthViewModelImpl(C9508g c9508g, C11082S c11082s) {
        Set<String> queryParameterNames;
        super(new C9509h());
        LinkedHashMap linkedHashMap = null;
        this.f39019i = AbstractC8168p6.m8749b("AipOauthViewModel", null);
        C5405j.f17672g.getClass();
        String str = (String) C5405j.f17673h.m5892c(c11082s);
        Intent intent = (Intent) c11082s.m12131b("android-support-nav:controller:deepLinkIntent");
        Uri data = intent != null ? intent.getData() : null;
        if (data != null && (queryParameterNames = data.getQueryParameterNames()) != null) {
            Set<String> set = queryParameterNames;
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(set, 10));
            linkedHashMap = new LinkedHashMap(iM19257b < 16 ? 16 : iM19257b);
            for (Object obj : set) {
                String queryParameter = data.getQueryParameter((String) obj);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                linkedHashMap.put(obj, queryParameter);
            }
        }
        m14394i(new C124471(c9508g, str, linkedHashMap == null ? C17690x.f56481Y : linkedHashMap, this, null));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }
}
