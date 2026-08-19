package p598Ye;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.A */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10015A {
    public static final C10049t Companion = new C10049t();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f29699g = {null, null, null, new C11158d(C10038i.f29740a, 0), null, new C11158d(C10050u.f29765a, 0)};

    /* JADX INFO: renamed from: a */
    public final String f29700a;

    /* JADX INFO: renamed from: b */
    public final String f29701b;

    /* JADX INFO: renamed from: c */
    public final C10037h f29702c;

    /* JADX INFO: renamed from: d */
    public final List f29703d;

    /* JADX INFO: renamed from: e */
    public final boolean f29704e;

    /* JADX INFO: renamed from: f */
    public final List f29705f;

    public C10015A(int i10, String str, String str2, C10037h c10037h, List list, boolean z6, List list2) {
        if (4 != (i10 & 4)) {
            AbstractC11153a0.m12389l(i10, 4, C10048s.f29764a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f29700a = null;
        } else {
            this.f29700a = str;
        }
        if ((i10 & 2) == 0) {
            this.f29701b = "";
        } else {
            this.f29701b = str2;
        }
        this.f29702c = c10037h;
        int i11 = i10 & 8;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f29703d = c17689w;
        } else {
            this.f29703d = list;
        }
        if ((i10 & 16) == 0) {
            this.f29704e = false;
        } else {
            this.f29704e = z6;
        }
        if ((i10 & 32) == 0) {
            this.f29705f = c17689w;
        } else {
            this.f29705f = list2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10015A)) {
            return false;
        }
        C10015A c10015a = (C10015A) obj;
        String str = c10015a.f29700a;
        String str2 = this.f29700a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f29701b, c10015a.f29701b) && AbstractC16544l.m18089b(this.f29702c, c10015a.f29702c) && AbstractC16544l.m18089b(this.f29703d, c10015a.f29703d) && this.f29704e == c10015a.f29704e && AbstractC16544l.m18089b(this.f29705f, c10015a.f29705f);
    }

    public final int hashCode() {
        String str = this.f29700a;
        return this.f29705f.hashCode() + ((AbstractC14376f.m15858x(this.f29703d, (this.f29702c.hashCode() + AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f29701b)) * 31, 31) + (this.f29704e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C10015A(String str, String instructions, C10037h c10037h, ArrayList arrayList, List list, int i10) {
        str = (i10 & 1) != 0 ? null : str;
        instructions = (i10 & 2) != 0 ? "" : instructions;
        List files = arrayList;
        files = (i10 & 8) != 0 ? C17689w.f56480Y : files;
        AbstractC16544l.m18094g(instructions, "instructions");
        AbstractC16544l.m18094g(files, "files");
        this.f29700a = str;
        this.f29701b = instructions;
        this.f29702c = c10037h;
        this.f29703d = files;
        this.f29704e = false;
        this.f29705f = list;
    }
}
