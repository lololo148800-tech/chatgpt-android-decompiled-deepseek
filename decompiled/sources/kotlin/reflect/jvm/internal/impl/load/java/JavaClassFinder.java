package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaClassFinder {
    JavaClass findClass(Request request);

    JavaPackage findPackage(FqName fqName, boolean z6);

    Set<String> knownClassNamesInPackage(FqName fqName);

    public static final class Request {

        /* JADX INFO: renamed from: a */
        public final ClassId f51728a;

        /* JADX INFO: renamed from: b */
        public final byte[] f51729b;

        /* JADX INFO: renamed from: c */
        public final JavaClass f51730c;

        public Request(ClassId classId, byte[] bArr, JavaClass javaClass) {
            AbstractC16544l.m18094g(classId, "classId");
            this.f51728a = classId;
            this.f51729b = bArr;
            this.f51730c = javaClass;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return AbstractC16544l.m18089b(this.f51728a, request.f51728a) && AbstractC16544l.m18089b(this.f51729b, request.f51729b) && AbstractC16544l.m18089b(this.f51730c, request.f51730c);
        }

        public final ClassId getClassId() {
            return this.f51728a;
        }

        public int hashCode() {
            int iHashCode = this.f51728a.hashCode() * 31;
            byte[] bArr = this.f51729b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            JavaClass javaClass = this.f51730c;
            return iHashCode2 + (javaClass != null ? javaClass.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f51728a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f51729b) + ", outerClass=" + this.f51730c + ')';
        }

        public /* synthetic */ Request(ClassId classId, byte[] bArr, JavaClass javaClass, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(classId, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : javaClass);
        }
    }
}
