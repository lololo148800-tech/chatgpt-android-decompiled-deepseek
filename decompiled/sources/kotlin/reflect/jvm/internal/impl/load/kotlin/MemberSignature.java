package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import p025An.C0644w;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes2.dex */
public final class MemberSignature {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f52078a;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MemberSignature fromFieldNameAndDesc(String name, String desc) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(desc, "desc");
            return new MemberSignature(name + '#' + desc, null);
        }

        public final MemberSignature fromJvmMemberSignature(JvmMemberSignature signature) {
            AbstractC16544l.m18094g(signature, "signature");
            if (signature instanceof JvmMemberSignature.Method) {
                JvmMemberSignature.Method method = (JvmMemberSignature.Method) signature;
                return fromMethodNameAndDesc(method.getName(), method.getDesc());
            }
            if (!(signature instanceof JvmMemberSignature.Field)) {
                throw new C0644w();
            }
            JvmMemberSignature.Field field = (JvmMemberSignature.Field) signature;
            return fromFieldNameAndDesc(field.getName(), field.getDesc());
        }

        public final MemberSignature fromMethod(NameResolver nameResolver, JvmProtoBuf.JvmMethodSignature signature) {
            AbstractC16544l.m18094g(nameResolver, "nameResolver");
            AbstractC16544l.m18094g(signature, "signature");
            return fromMethodNameAndDesc(nameResolver.getString(signature.getName()), nameResolver.getString(signature.getDesc()));
        }

        public final MemberSignature fromMethodNameAndDesc(String name, String desc) {
            AbstractC16544l.m18094g(name, "name");
            AbstractC16544l.m18094g(desc, "desc");
            return new MemberSignature(name.concat(desc), null);
        }

        public final MemberSignature fromMethodSignatureAndParameterIndex(MemberSignature signature, int i10) {
            AbstractC16544l.m18094g(signature, "signature");
            return new MemberSignature(signature.getSignature() + '@' + i10, null);
        }
    }

    public MemberSignature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f52078a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MemberSignature) && AbstractC16544l.m18089b(this.f52078a, ((MemberSignature) obj).f52078a);
    }

    public final String getSignature() {
        return this.f52078a;
    }

    public int hashCode() {
        return this.f52078a.hashCode();
    }

    public String toString() {
        return AbstractC9306j0.m9892k(new StringBuilder("MemberSignature(signature="), this.f52078a, ')');
    }
}
