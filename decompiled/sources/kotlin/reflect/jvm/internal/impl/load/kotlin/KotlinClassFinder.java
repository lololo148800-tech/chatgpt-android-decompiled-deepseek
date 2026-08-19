package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* JADX INFO: loaded from: classes2.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    public static abstract class Result {

        public static final class ClassFileContent extends Result {
            public final byte[] getContent() {
                return null;
            }
        }

        public static final class KotlinClass extends Result {

            /* JADX INFO: renamed from: a */
            public final KotlinJvmBinaryClass f52075a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                AbstractC16544l.m18094g(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f52075a = kotlinJvmBinaryClass;
            }

            public final KotlinJvmBinaryClass getKotlinJvmBinaryClass() {
                return this.f52075a;
            }

            public /* synthetic */ KotlinClass(KotlinJvmBinaryClass kotlinJvmBinaryClass, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(kotlinJvmBinaryClass, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public Result(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final KotlinJvmBinaryClass toKotlinJvmBinaryClass() {
            KotlinClass kotlinClass = this instanceof KotlinClass ? (KotlinClass) this : null;
            if (kotlinClass != null) {
                return kotlinClass.getKotlinJvmBinaryClass();
            }
            return null;
        }
    }

    Result findKotlinClassOrContent(JavaClass javaClass, JvmMetadataVersion jvmMetadataVersion);

    Result findKotlinClassOrContent(ClassId classId, JvmMetadataVersion jvmMetadataVersion);
}
