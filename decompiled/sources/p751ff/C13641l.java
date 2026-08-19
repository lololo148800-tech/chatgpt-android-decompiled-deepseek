package p751ff;

import ao.AbstractC11153a0;
import bf.InterfaceC11374b0;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p098Di.InterfaceC2062k;
import p559Wn.C8972d;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: ff.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13641l implements InterfaceC2062k {
    public static final C13640k Companion = new C13640k();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f43087f = {null, new C8972d(AbstractC16526C.f51263a.mo5693b(InterfaceC11374b0.class), new Annotation[0]), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f43088a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11374b0 f43089b;

    /* JADX INFO: renamed from: c */
    public final String f43090c;

    /* JADX INFO: renamed from: d */
    public final String f43091d;

    /* JADX INFO: renamed from: e */
    public final boolean f43092e;

    public C13641l(String snorlaxId, InterfaceC11374b0 interfaceC11374b0, String str, String str2, boolean z6) {
        AbstractC16544l.m18094g(snorlaxId, "snorlaxId");
        this.f43088a = snorlaxId;
        this.f43089b = interfaceC11374b0;
        this.f43090c = str;
        this.f43091d = str2;
        this.f43092e = z6;
    }

    /* JADX INFO: renamed from: e */
    public static C13641l m15153e(C13641l c13641l, InterfaceC11374b0 interfaceC11374b0, String str, String str2, boolean z6, int i10) {
        String snorlaxId = c13641l.f43088a;
        if ((i10 & 2) != 0) {
            interfaceC11374b0 = c13641l.f43089b;
        }
        InterfaceC11374b0 interfaceC11374b1 = interfaceC11374b0;
        if ((i10 & 4) != 0) {
            str = c13641l.f43090c;
        }
        String str3 = str;
        if ((i10 & 8) != 0) {
            str2 = c13641l.f43091d;
        }
        String str4 = str2;
        if ((i10 & 16) != 0) {
            z6 = c13641l.f43092e;
        }
        c13641l.getClass();
        AbstractC16544l.m18094g(snorlaxId, "snorlaxId");
        return new C13641l(snorlaxId, interfaceC11374b1, str3, str4, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13641l)) {
            return false;
        }
        C13641l c13641l = (C13641l) obj;
        return AbstractC16544l.m18089b(this.f43088a, c13641l.f43088a) && AbstractC16544l.m18089b(this.f43089b, c13641l.f43089b) && AbstractC16544l.m18089b(this.f43090c, c13641l.f43090c) && AbstractC16544l.m18089b(this.f43091d, c13641l.f43091d) && this.f43092e == c13641l.f43092e;
    }

    public final int hashCode() {
        int iHashCode = this.f43088a.hashCode() * 31;
        InterfaceC11374b0 interfaceC11374b0 = this.f43089b;
        int iHashCode2 = (iHashCode + (interfaceC11374b0 == null ? 0 : interfaceC11374b0.hashCode())) * 31;
        String str = this.f43090c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f43091d;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f43092e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C13641l(int i10, String str, InterfaceC11374b0 interfaceC11374b0, String str2, String str3, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C13639j.f43086a.getDescriptor());
            throw null;
        }
        this.f43088a = str;
        if ((i10 & 2) == 0) {
            this.f43089b = null;
        } else {
            this.f43089b = interfaceC11374b0;
        }
        if ((i10 & 4) == 0) {
            this.f43090c = null;
        } else {
            this.f43090c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f43091d = null;
        } else {
            this.f43091d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f43092e = false;
        } else {
            this.f43092e = z6;
        }
    }
}
