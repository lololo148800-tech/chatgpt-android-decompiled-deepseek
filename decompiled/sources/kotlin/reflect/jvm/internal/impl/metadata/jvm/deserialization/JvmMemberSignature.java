package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        public final String f52659a;

        /* JADX INFO: renamed from: b */
        public final String f52660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(String name, String desc) {
            super(null);
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(desc, "desc");
            this.f52659a = name;
            this.f52660b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String asString() {
            return getName() + ':' + getDesc();
        }

        public final String component1() {
            return this.f52659a;
        }

        public final String component2() {
            return this.f52660b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Field)) {
                return false;
            }
            Field field = (Field) obj;
            return AbstractC16544l.m18089b(this.f52659a, field.f52659a) && AbstractC16544l.m18089b(this.f52660b, field.f52660b);
        }

        public String getDesc() {
            return this.f52660b;
        }

        public String getName() {
            return this.f52659a;
        }

        public int hashCode() {
            return this.f52660b.hashCode() + (this.f52659a.hashCode() * 31);
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a */
        public final String f52661a;

        /* JADX INFO: renamed from: b */
        public final String f52662b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(String name, String desc) {
            super(null);
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(desc, "desc");
            this.f52661a = name;
            this.f52662b = desc;
        }

        public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = method.f52661a;
            }
            if ((i10 & 2) != 0) {
                str2 = method.f52662b;
            }
            return method.copy(str, str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        public String asString() {
            return getName() + getDesc();
        }

        public final Method copy(String name, String desc) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(desc, "desc");
            return new Method(name, desc);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Method)) {
                return false;
            }
            Method method = (Method) obj;
            return AbstractC16544l.m18089b(this.f52661a, method.f52661a) && AbstractC16544l.m18089b(this.f52662b, method.f52662b);
        }

        public String getDesc() {
            return this.f52662b;
        }

        public String getName() {
            return this.f52661a;
        }

        public int hashCode() {
            return this.f52662b.hashCode() + (this.f52661a.hashCode() * 31);
        }
    }

    public JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public abstract String asString();

    public final String toString() {
        return asString();
    }
}
