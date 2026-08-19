package p966qg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p990rg.EnumC18976c;

/* JADX INFO: renamed from: qg.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18705c {
    public static final C18704b Companion = new C18704b();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f59529g = {null, null, null, null, EnumC18976c.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f59530a;

    /* JADX INFO: renamed from: b */
    public final String f59531b;

    /* JADX INFO: renamed from: c */
    public final String f59532c;

    /* JADX INFO: renamed from: d */
    public final String f59533d;

    /* JADX INFO: renamed from: e */
    public final EnumC18976c f59534e;

    /* JADX INFO: renamed from: f */
    public final String f59535f;

    public /* synthetic */ C18705c(int i10, String str, String str2, String str3, String str4, EnumC18976c enumC18976c, String str5) {
        if (31 != (i10 & 31)) {
            AbstractC11153a0.m12389l(i10, 31, C18703a.f59528a.getDescriptor());
            throw null;
        }
        this.f59530a = str;
        this.f59531b = str2;
        this.f59532c = str3;
        this.f59533d = str4;
        this.f59534e = enumC18976c;
        if ((i10 & 32) == 0) {
            this.f59535f = "";
        } else {
            this.f59535f = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18705c)) {
            return false;
        }
        C18705c c18705c = (C18705c) obj;
        return AbstractC16544l.m18089b(this.f59530a, c18705c.f59530a) && AbstractC16544l.m18089b(this.f59531b, c18705c.f59531b) && AbstractC16544l.m18089b(this.f59532c, c18705c.f59532c) && AbstractC16544l.m18089b(this.f59533d, c18705c.f59533d) && this.f59534e == c18705c.f59534e && AbstractC16544l.m18089b(this.f59535f, c18705c.f59535f);
    }

    public final int hashCode() {
        return this.f59535f.hashCode() + ((this.f59534e.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f59530a.hashCode() * 31, 31, this.f59531b), 31, this.f59532c), 31, this.f59533d)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
