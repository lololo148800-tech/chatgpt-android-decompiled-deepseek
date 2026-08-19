package com.auth0.android.request.internal;

import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;
import p214Ib.AbstractC3673p;
import p214Ib.C3669l;
import p214Ib.C3675r;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p214Ib.InterfaceC3672o;
import p568X6.C9071a;
import p960q9.C18655i;

/* JADX INFO: renamed from: com.auth0.android.request.internal.j */
/* JADX INFO: loaded from: classes.dex */
public final class C11851j implements InterfaceC3672o {

    /* JADX INFO: renamed from: a */
    public final C3669l f35996a = new C3669l();

    @Override // p214Ib.InterfaceC3672o
    /* JADX INFO: renamed from: a */
    public final Object mo4388a(AbstractC3673p abstractC3673p, Type type, C18655i c18655i) {
        abstractC3673p.getClass();
        if (!(abstractC3673p instanceof C3676s) || (abstractC3673p instanceof C3675r) || ((AbstractCollection) abstractC3673p.m4390m().f11174Y.entrySet()).isEmpty()) {
            throw new C3677t("user profile json is not a valid json object");
        }
        C3676s c3676sM4390m = abstractC3673p.m4390m();
        String str = (String) c18655i.m20029k(c3676sM4390m.m4396x("email"), String.class);
        String str2 = (String) c18655i.m20029k(c3676sM4390m.m4396x("given_name"), String.class);
        String str3 = (String) c18655i.m20029k(c3676sM4390m.m4396x("family_name"), String.class);
        Boolean bool = c3676sM4390m.f11174Y.containsKey("email_verified") ? (Boolean) c18655i.m20029k(c3676sM4390m.m4396x("email_verified"), Boolean.class) : Boolean.FALSE;
        AbstractC3673p abstractC3673pM4396x = c3676sM4390m.m4396x("created_at");
        C3669l c3669l = this.f35996a;
        c3669l.getClass();
        List list = (List) c18655i.m20029k(c3676sM4390m.m4396x("identities"), new UserProfileDeserializer$1().getType());
        Type type2 = new UserProfileDeserializer$2().getType();
        return new C9071a(str, bool, str3, list, (Map) c18655i.m20029k(c3676sM4390m, type2), (Map) c18655i.m20029k(c3676sM4390m.m4396x("user_metadata"), type2), (Map) c18655i.m20029k(c3676sM4390m.m4396x("app_metadata"), type2), str2);
    }
}
