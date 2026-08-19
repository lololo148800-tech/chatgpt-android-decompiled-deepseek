package p172Gi;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Gi.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C3086s {
    public static final C3085r Companion = new C3085r();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f9289e = {null, EnumC3089v.Companion.serializer(), new C11158d(C11181o0.f33827a, 0), null};

    /* JADX INFO: renamed from: a */
    public final String f9290a;

    /* JADX INFO: renamed from: b */
    public final EnumC3089v f9291b;

    /* JADX INFO: renamed from: c */
    public final List f9292c;

    /* JADX INFO: renamed from: d */
    public final String f9293d;

    public /* synthetic */ C3086s(int i10, String str, EnumC3089v enumC3089v, List list, String str2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C3084q.f9288a.getDescriptor());
            throw null;
        }
        this.f9290a = str;
        this.f9291b = enumC3089v;
        this.f9292c = list;
        this.f9293d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3086s)) {
            return false;
        }
        C3086s c3086s = (C3086s) obj;
        return AbstractC16544l.m18089b(this.f9290a, c3086s.f9290a) && this.f9291b == c3086s.f9291b && AbstractC16544l.m18089b(this.f9292c, c3086s.f9292c) && AbstractC16544l.m18089b(this.f9293d, c3086s.f9293d);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f9292c, (this.f9291b.hashCode() + (this.f9290a.hashCode() * 31)) * 31, 31);
        String str = this.f9293d;
        return iM15858x + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C3086s(String conversationId, EnumC3089v enumC3089v, List list, String str) {
        AbstractC16544l.m18094g(conversationId, "conversationId");
        this.f9290a = conversationId;
        this.f9291b = enumC3089v;
        this.f9292c = list;
        this.f9293d = str;
    }
}
