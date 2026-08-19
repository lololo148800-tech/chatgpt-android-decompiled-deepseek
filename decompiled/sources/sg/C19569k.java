package sg;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: sg.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19569k {
    public static final C19564f Companion = new C19564f();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f62154e = {null, AbstractC11153a0.m12383f("com.openai.feature.reporting.ReportAdditionalField.Type", EnumC19568j.values()), null, null};

    /* JADX INFO: renamed from: a */
    public final String f62155a;

    /* JADX INFO: renamed from: b */
    public final EnumC19568j f62156b;

    /* JADX INFO: renamed from: c */
    public final String f62157c;

    /* JADX INFO: renamed from: d */
    public final boolean f62158d;

    public C19569k(int i10, String str, EnumC19568j enumC19568j, String str2, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C19563e.f62146a.getDescriptor());
            throw null;
        }
        this.f62155a = str;
        if ((i10 & 2) == 0) {
            this.f62156b = EnumC19568j.f62151o0;
        } else {
            this.f62156b = enumC19568j;
        }
        if ((i10 & 4) == 0) {
            this.f62157c = null;
        } else {
            this.f62157c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f62158d = false;
        } else {
            this.f62158d = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19569k)) {
            return false;
        }
        C19569k c19569k = (C19569k) obj;
        return AbstractC16544l.m18089b(this.f62155a, c19569k.f62155a) && this.f62156b == c19569k.f62156b && AbstractC16544l.m18089b(this.f62157c, c19569k.f62157c) && this.f62158d == c19569k.f62158d;
    }

    public final int hashCode() {
        int iHashCode = (this.f62156b.hashCode() + (this.f62155a.hashCode() * 31)) * 31;
        String str = this.f62157c;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f62158d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C19569k(EnumC19568j enumC19568j, String str) {
        this.f62155a = ParameterNames.f31999ID;
        this.f62156b = enumC19568j;
        this.f62157c = str;
        this.f62158d = true;
    }
}
