package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import p003A1.AbstractC0168G;

/* JADX INFO: loaded from: classes2.dex */
public final class IncompatibleVersionErrorData<T> {

    /* JADX INFO: renamed from: a */
    public final Object f53032a;

    /* JADX INFO: renamed from: b */
    public final Object f53033b;

    /* JADX INFO: renamed from: c */
    public final Object f53034c;

    /* JADX INFO: renamed from: d */
    public final Object f53035d;

    /* JADX INFO: renamed from: e */
    public final String f53036e;

    /* JADX INFO: renamed from: f */
    public final ClassId f53037f;

    public IncompatibleVersionErrorData(T t10, T t11, T t12, T t13, String filePath, ClassId classId) {
        AbstractC16544l.m18094g(filePath, "filePath");
        AbstractC16544l.m18094g(classId, "classId");
        this.f53032a = t10;
        this.f53033b = t11;
        this.f53034c = t12;
        this.f53035d = t13;
        this.f53036e = filePath;
        this.f53037f = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return AbstractC16544l.m18089b(this.f53032a, incompatibleVersionErrorData.f53032a) && AbstractC16544l.m18089b(this.f53033b, incompatibleVersionErrorData.f53033b) && AbstractC16544l.m18089b(this.f53034c, incompatibleVersionErrorData.f53034c) && AbstractC16544l.m18089b(this.f53035d, incompatibleVersionErrorData.f53035d) && AbstractC16544l.m18089b(this.f53036e, incompatibleVersionErrorData.f53036e) && AbstractC16544l.m18089b(this.f53037f, incompatibleVersionErrorData.f53037f);
    }

    public int hashCode() {
        Object obj = this.f53032a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f53033b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f53034c;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f53035d;
        return this.f53037f.hashCode() + AbstractC0168G.m527p((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31, 31, this.f53036e);
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f53032a + ", compilerVersion=" + this.f53033b + ", languageVersion=" + this.f53034c + ", expectedVersion=" + this.f53035d + ", filePath=" + this.f53036e + ", classId=" + this.f53037f + ')';
    }
}
