package gf;

import ao.C11158d;
import bf.InterfaceC11374b0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p098Di.InterfaceC2062k;
import p559Wn.C8972d;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: renamed from: gf.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C14130o implements InterfaceC2062k {
    public static final C14129n Companion = new C14129n();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f44467e = {new C11158d(new C8972d(AbstractC16526C.f51263a.mo5693b(InterfaceC11374b0.class), new Annotation[0]), 0), null, null, null};

    /* JADX INFO: renamed from: a */
    public final List f44468a;

    /* JADX INFO: renamed from: b */
    public final boolean f44469b;

    /* JADX INFO: renamed from: c */
    public final String f44470c;

    /* JADX INFO: renamed from: d */
    public final boolean f44471d;

    public /* synthetic */ C14130o(int i10, String str, List list, boolean z6, boolean z10) {
        this.f44468a = (i10 & 1) == 0 ? C17689w.f56480Y : list;
        if ((i10 & 2) == 0) {
            this.f44469b = false;
        } else {
            this.f44469b = z6;
        }
        this.f44470c = (i10 & 4) == 0 ? null : str;
        if ((i10 & 8) == 0) {
            this.f44471d = false;
        } else {
            this.f44471d = z10;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C14130o m15500e(C14130o c14130o, List list, boolean z6, String str, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            list = c14130o.f44468a;
        }
        if ((i10 & 2) != 0) {
            z6 = c14130o.f44469b;
        }
        if ((i10 & 4) != 0) {
            str = c14130o.f44470c;
        }
        if ((i10 & 8) != 0) {
            z10 = c14130o.f44471d;
        }
        c14130o.getClass();
        AbstractC16544l.m18094g(list, "list");
        return new C14130o(str, list, z6, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14130o)) {
            return false;
        }
        C14130o c14130o = (C14130o) obj;
        return AbstractC16544l.m18089b(this.f44468a, c14130o.f44468a) && this.f44469b == c14130o.f44469b && AbstractC16544l.m18089b(this.f44470c, c14130o.f44470c) && this.f44471d == c14130o.f44471d;
    }

    public final int hashCode() {
        int iHashCode = ((this.f44468a.hashCode() * 31) + (this.f44469b ? 1231 : 1237)) * 31;
        String str = this.f44470c;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f44471d ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C14130o(String str, List list, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(list, "list");
        this.f44468a = list;
        this.f44469b = z6;
        this.f44470c = str;
        this.f44471d = z10;
    }
}
