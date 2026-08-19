package io.ktor.client.plugins.auth;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p086D6.C1961e;
import p086D6.InterfaceC1957a;
import p1091wn.InterfaceC21029j;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21316j;
import p1113xn.C21317k;
import p225Im.C3743B;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p432Rh.C6894g;
import p466T0.C7186m;
import p523V9.AbstractC8150n4;
import p544W9.AbstractC8443A;
import p544W9.AbstractC8639g4;
import p582Xk.C9525b;
import p582Xk.C9530g;
import p886m5.AbstractC17167b;
import p909nm.AbstractC17680n;
import p917o6.C17858k;
import sl.C19666a;
import sl.C19674i;
import sl.C19677l;
import tl.C20003c;

/* JADX INFO: renamed from: io.ktor.client.plugins.auth.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15058c implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46787Y;

    public /* synthetic */ C15058c(int i10) {
        this.f46787Y = i10;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InterfaceC3777y interfaceC3777yMo5695d;
        String str;
        String str2;
        switch (this.f46787Y) {
            case 0:
                C9525b createClientPlugin = (C9525b) obj;
                AbstractC16544l.m18094g(createClientPlugin, "$this$createClientPlugin");
                List listM19322C0 = AbstractC17680n.m19322C0(((C15057b) createClientPlugin.f28664b).f46786a);
                createClientPlugin.f28663a.f21675v0.m20652f(AbstractC15064i.f46820d, listM19322C0);
                C20003c c20003c = new C20003c();
                C16527D c16527d = AbstractC16526C.f51263a;
                InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(Map.class);
                try {
                    C3743B c3743b = C3743B.f11391c;
                    interfaceC3777yMo5695d = c16527d.mo5695d(c16527d.mo5704m(c16527d.mo5693b(Map.class), Arrays.asList(AbstractC8443A.m9046b(AbstractC16526C.m18075c(C6894g.class)), AbstractC8443A.m9046b(AbstractC16526C.m18075c(Integer.TYPE))), false));
                    break;
                } catch (Throwable unused) {
                    interfaceC3777yMo5695d = null;
                }
                C19666a c19666a = new C19666a("ProviderVersionAttributeKey", new C21296a(interfaceC3756dMo5693b, interfaceC3777yMo5695d));
                createClientPlugin.m10029a(C9530g.f28676b, new C15060e(listM19322C0, c20003c, c19666a, null));
                createClientPlugin.m10029a(C9530g.f28677c, new C15061f(listM19322C0, c20003c, c19666a, null));
                return C17296C.f55119a;
            case 1:
                return Boolean.valueOf(AbstractC8639g4.m9298b(((Character) obj).charValue()));
            case 2:
                return Boolean.valueOf(AbstractC8639g4.m9300d(((Character) obj).charValue()));
            case 3:
                return Boolean.valueOf(AbstractC8639g4.m9300d(((Character) obj).charValue()));
            case 4:
                return Boolean.valueOf(AbstractC8639g4.m9298b(((Character) obj).charValue()));
            case 5:
                C21317k it = (C21317k) obj;
                AbstractC16544l.m18094g(it, "it");
                C7186m c7186m = it.f67755c;
                C21316j c21316jM7561j = c7186m.m7561j(2);
                String str3 = "";
                if (c21316jM7561j == null || (str = c21316jM7561j.f67751a) == null) {
                    str = "";
                }
                C21316j c21316jM7561j2 = c7186m.m7561j(4);
                if (c21316jM7561j2 != null && (str2 = c21316jM7561j2.f67751a) != null) {
                    str3 = str2;
                }
                return new C17309l(str, str3);
            case 6:
                C17309l cookie = (C17309l) obj;
                AbstractC16544l.m18094g(cookie, "cookie");
                String str4 = (String) cookie.f55137Z;
                return (AbstractC21329w.m21734u(str4, Separators.DOUBLE_QUOTE, false) && AbstractC21329w.m21725l(str4, Separators.DOUBLE_QUOTE, false)) ? new C17309l(cookie.f55136Y, AbstractC21322p.m21691Y(str4)) : cookie;
            case 7:
                C17309l it2 = (C17309l) obj;
                AbstractC16544l.m18094g(it2, "it");
                String str5 = (String) it2.f55136Y;
                Object obj2 = it2.f55137Z;
                if (obj2 == null) {
                    return str5;
                }
                return str5 + '=' + String.valueOf(obj2);
            case 8:
                C21317k it3 = (C21317k) obj;
                AbstractC16544l.m18094g(it3, "it");
                return AbstractC21322p.m21710r0(1, it3.m21659c());
            case 9:
                return (AbstractC17167b) obj;
            case 10:
                InterfaceC1957a it4 = (InterfaceC1957a) obj;
                AbstractC16544l.m18094g(it4, "it");
                return Boolean.valueOf(it4 instanceof C1961e);
            case 11:
                C17858k it5 = (C17858k) obj;
                AbstractC16544l.m18094g(it5, "it");
                it5.f56945a.getClass();
                return true;
            case 12:
                Map.Entry DelegatingMutableSet = (Map.Entry) obj;
                AbstractC16544l.m18094g(DelegatingMutableSet, "$this$DelegatingMutableSet");
                return new C19677l(((C19674i) DelegatingMutableSet.getKey()).f62361a, DelegatingMutableSet.getValue());
            case 13:
                Map.Entry DelegatingMutableSet2 = (Map.Entry) obj;
                AbstractC16544l.m18094g(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                return new C19677l(AbstractC8150n4.m8688a((String) DelegatingMutableSet2.getKey()), DelegatingMutableSet2.getValue());
            case 14:
                C19674i DelegatingMutableSet3 = (C19674i) obj;
                AbstractC16544l.m18094g(DelegatingMutableSet3, "$this$DelegatingMutableSet");
                return DelegatingMutableSet3.f62361a;
            case 15:
                String DelegatingMutableSet4 = (String) obj;
                AbstractC16544l.m18094g(DelegatingMutableSet4, "$this$DelegatingMutableSet");
                return AbstractC8150n4.m8688a(DelegatingMutableSet4);
            case 16:
                C17858k it6 = (C17858k) obj;
                AbstractC16544l.m18094g(it6, "it");
                it6.f56945a.getClass();
                return Boolean.FALSE;
            case 17:
                InterfaceC21029j it7 = (InterfaceC21029j) obj;
                AbstractC16544l.m18094g(it7, "it");
                return it7.iterator();
            case 18:
                return obj;
            case 19:
                return Boolean.valueOf(obj == null);
            default:
                String it8 = (String) obj;
                AbstractC16544l.m18094g(it8, "it");
                if (AbstractC21322p.m21681O(it8)) {
                    return it8.length() < 2 ? "  " : it8;
                }
                return "  ".concat(it8);
        }
    }
}
