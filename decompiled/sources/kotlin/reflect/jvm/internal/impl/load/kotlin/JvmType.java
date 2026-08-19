package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmType {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static final Primitive f52064a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b */
    public static final Primitive f52065b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c */
    public static final Primitive f52066c = new Primitive(JvmPrimitiveType.BYTE);

    /* JADX INFO: renamed from: d */
    public static final Primitive f52067d = new Primitive(JvmPrimitiveType.SHORT);

    /* JADX INFO: renamed from: e */
    public static final Primitive f52068e = new Primitive(JvmPrimitiveType.INT);

    /* JADX INFO: renamed from: f */
    public static final Primitive f52069f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g */
    public static final Primitive f52070g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h */
    public static final Primitive f52071h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        /* JADX INFO: renamed from: i */
        public final JvmType f52072i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(JvmType elementType) {
            super(null);
            AbstractC16544l.m18094g(elementType, "elementType");
            this.f52072i = elementType;
        }

        public final JvmType getElementType() {
            return this.f52072i;
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.f52064a;
        }

        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.f52066c;
        }

        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.f52065b;
        }

        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.f52071h;
        }

        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f52069f;
        }

        public final Primitive getINT$descriptors_jvm() {
            return JvmType.f52068e;
        }

        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.f52070g;
        }

        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.f52067d;
        }
    }

    public static final class Object extends JvmType {

        /* JADX INFO: renamed from: i */
        public final String f52073i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(String internalName) {
            super(null);
            AbstractC16544l.m18094g(internalName, "internalName");
            this.f52073i = internalName;
        }

        public final String getInternalName() {
            return this.f52073i;
        }
    }

    public static final class Primitive extends JvmType {

        /* JADX INFO: renamed from: i */
        public final JvmPrimitiveType f52074i;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f52074i = jvmPrimitiveType;
        }

        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.f52074i;
        }
    }

    public JvmType(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public String toString() {
        return C16572a.m18247b(this);
    }
}
