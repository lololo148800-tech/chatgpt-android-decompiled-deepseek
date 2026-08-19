package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public interface SignaturePropagator {
    public static final SignaturePropagator DO_NOTHING = new C16564a();

    public static class PropagatedSignature {

        /* JADX INFO: renamed from: a */
        public final KotlinType f51818a;

        /* JADX INFO: renamed from: b */
        public final KotlinType f51819b;

        /* JADX INFO: renamed from: c */
        public final List f51820c;

        /* JADX INFO: renamed from: d */
        public final List f51821d;

        /* JADX INFO: renamed from: e */
        public final List f51822e;

        /* JADX INFO: renamed from: f */
        public final boolean f51823f;

        public PropagatedSignature(KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2, List<String> list3, boolean z6) {
            if (kotlinType == null) {
                m18179a(0);
                throw null;
            }
            if (list == null) {
                m18179a(1);
                throw null;
            }
            if (list2 == null) {
                m18179a(2);
                throw null;
            }
            if (list3 == null) {
                m18179a(3);
                throw null;
            }
            this.f51818a = kotlinType;
            this.f51819b = kotlinType2;
            this.f51820c = list;
            this.f51821d = list2;
            this.f51822e = list3;
            this.f51823f = z6;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18179a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List<String> getErrors() {
            List<String> list = this.f51822e;
            if (list != null) {
                return list;
            }
            m18179a(7);
            throw null;
        }

        public KotlinType getReceiverType() {
            return this.f51819b;
        }

        public KotlinType getReturnType() {
            KotlinType kotlinType = this.f51818a;
            if (kotlinType != null) {
                return kotlinType;
            }
            m18179a(4);
            throw null;
        }

        public List<TypeParameterDescriptor> getTypeParameters() {
            List<TypeParameterDescriptor> list = this.f51821d;
            if (list != null) {
                return list;
            }
            m18179a(6);
            throw null;
        }

        public List<ValueParameterDescriptor> getValueParameters() {
            List<ValueParameterDescriptor> list = this.f51820c;
            if (list != null) {
                return list;
            }
            m18179a(5);
            throw null;
        }

        public boolean hasStableParameterNames() {
            return this.f51823f;
        }
    }

    void reportSignatureErrors(CallableMemberDescriptor callableMemberDescriptor, List<String> list);

    PropagatedSignature resolvePropagatedSignature(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2);
}
