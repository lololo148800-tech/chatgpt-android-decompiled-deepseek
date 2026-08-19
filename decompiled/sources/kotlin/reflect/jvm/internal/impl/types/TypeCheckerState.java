package kotlin.reflect.jvm.internal.impl.types;

import androidx.work.impl.utils.p651oZ.HhJS;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p174Gk.uSfJ.HpucjswO;
import p523V9.AbstractC7877E4;

/* JADX INFO: loaded from: classes2.dex */
public class TypeCheckerState {

    /* JADX INFO: renamed from: a */
    public final boolean f53193a;

    /* JADX INFO: renamed from: b */
    public final boolean f53194b;

    /* JADX INFO: renamed from: c */
    public final boolean f53195c;

    /* JADX INFO: renamed from: d */
    public final TypeSystemContext f53196d;

    /* JADX INFO: renamed from: e */
    public final AbstractTypePreparator f53197e;

    /* JADX INFO: renamed from: f */
    public final AbstractTypeRefiner f53198f;

    /* JADX INFO: renamed from: g */
    public int f53199g;

    /* JADX INFO: renamed from: h */
    public ArrayDeque f53200h;

    /* JADX INFO: renamed from: i */
    public SmartSet f53201i;

    public interface ForkPointContext {

        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a */
            public boolean f53202a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            public void fork(InterfaceC1426a block) {
                AbstractC16544l.m18094g(block, "block");
                if (this.f53202a) {
                    return;
                }
                this.f53202a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean getResult() {
                return this.f53202a;
            }
        }

        void fork(InterfaceC1426a interfaceC1426a);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LowerCapturedTypePolicy {
        public static final LowerCapturedTypePolicy CHECK_ONLY_LOWER;
        public static final LowerCapturedTypePolicy CHECK_SUBTYPE_AND_LOWER;
        public static final LowerCapturedTypePolicy SKIP_LOWER;

        /* JADX INFO: renamed from: Y */
        public static final /* synthetic */ LowerCapturedTypePolicy[] f53203Y;

        static {
            LowerCapturedTypePolicy lowerCapturedTypePolicy = new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0);
            CHECK_ONLY_LOWER = lowerCapturedTypePolicy;
            LowerCapturedTypePolicy lowerCapturedTypePolicy2 = new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1);
            CHECK_SUBTYPE_AND_LOWER = lowerCapturedTypePolicy2;
            LowerCapturedTypePolicy lowerCapturedTypePolicy3 = new LowerCapturedTypePolicy("SKIP_LOWER", 2);
            SKIP_LOWER = lowerCapturedTypePolicy3;
            LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = {lowerCapturedTypePolicy, lowerCapturedTypePolicy2, lowerCapturedTypePolicy3};
            f53203Y = lowerCapturedTypePolicyArr;
            AbstractC7877E4.m8156j(lowerCapturedTypePolicyArr);
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) f53203Y.clone();
        }
    }

    public static abstract class SupertypesPolicy {

        public static abstract class DoCustomTransform extends SupertypesPolicy {
            public DoCustomTransform() {
                super(null);
            }
        }

        public static final class LowerIfFlexible extends SupertypesPolicy {
            public static final LowerIfFlexible INSTANCE = new LowerIfFlexible(null);

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType */
            public RigidTypeMarker mo22591transformType(TypeCheckerState state, KotlinTypeMarker type) {
                AbstractC16544l.m18094g(state, "state");
                AbstractC16544l.m18094g(type, "type");
                return state.getTypeSystemContext().lowerBoundIfFlexible(type);
            }
        }

        public static final class None extends SupertypesPolicy {
            public static final None INSTANCE = new None(null);

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ RigidTypeMarker mo22591transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker) {
                return (RigidTypeMarker) transformType(typeCheckerState, kotlinTypeMarker);
            }

            public Void transformType(TypeCheckerState state, KotlinTypeMarker type) {
                AbstractC16544l.m18094g(state, "state");
                AbstractC16544l.m18094g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        public static final class UpperIfFlexible extends SupertypesPolicy {
            public static final UpperIfFlexible INSTANCE = new UpperIfFlexible(null);

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: transformType */
            public RigidTypeMarker mo22591transformType(TypeCheckerState state, KotlinTypeMarker type) {
                AbstractC16544l.m18094g(state, "state");
                AbstractC16544l.m18094g(type, "type");
                return state.getTypeSystemContext().upperBoundIfFlexible(type);
            }
        }

        public SupertypesPolicy(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX INFO: renamed from: transformType */
        public abstract RigidTypeMarker mo22591transformType(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);
    }

    public TypeCheckerState(boolean z6, boolean z10, boolean z11, TypeSystemContext typeSystemContext, AbstractTypePreparator kotlinTypePreparator, AbstractTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(typeSystemContext, "typeSystemContext");
        AbstractC16544l.m18094g(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f53193a = z6;
        this.f53194b = z10;
        this.f53195c = z11;
        this.f53196d = typeSystemContext;
        this.f53197e = kotlinTypePreparator;
        this.f53198f = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean addSubtypeConstraint$default(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return typeCheckerState.addSubtypeConstraint(kotlinTypeMarker, kotlinTypeMarker2, z6);
    }

    public Boolean addSubtypeConstraint(KotlinTypeMarker subType, KotlinTypeMarker superType, boolean z6) {
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superType, "superType");
        return null;
    }

    public final void clear() {
        ArrayDeque arrayDeque = this.f53200h;
        AbstractC16544l.m18091d(arrayDeque);
        arrayDeque.clear();
        SmartSet smartSet = this.f53201i;
        AbstractC16544l.m18091d(smartSet);
        smartSet.clear();
    }

    public boolean customIsSubtypeOf(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker superType) {
        AbstractC16544l.m18094g(kotlinTypeMarker, HhJS.sgLMJD);
        AbstractC16544l.m18094g(superType, "superType");
        return true;
    }

    public LowerCapturedTypePolicy getLowerCapturedTypePolicy(RigidTypeMarker subType, CapturedTypeMarker superType) {
        AbstractC16544l.m18094g(subType, "subType");
        AbstractC16544l.m18094g(superType, "superType");
        return LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<RigidTypeMarker> getSupertypesDeque() {
        return this.f53200h;
    }

    public final Set<RigidTypeMarker> getSupertypesSet() {
        return this.f53201i;
    }

    public final TypeSystemContext getTypeSystemContext() {
        return this.f53196d;
    }

    public final void initialize() {
        if (this.f53200h == null) {
            this.f53200h = new ArrayDeque(4);
        }
        if (this.f53201i == null) {
            this.f53201i = SmartSet.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(KotlinTypeMarker type) {
        AbstractC16544l.m18094g(type, "type");
        return this.f53195c && this.f53196d.isTypeVariableType(type);
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.f53193a;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.f53194b;
    }

    public final KotlinTypeMarker refineType(KotlinTypeMarker type) {
        AbstractC16544l.m18094g(type, "type");
        return this.f53198f.refineType(type);
    }

    public boolean runForkingPoint(InterfaceC1436k block) {
        AbstractC16544l.m18094g(block, "block");
        ForkPointContext.Default r6 = new ForkPointContext.Default();
        block.invoke(r6);
        return r6.getResult();
    }

    public final KotlinTypeMarker prepareType(KotlinTypeMarker kotlinTypeMarker) {
        AbstractC16544l.m18094g(kotlinTypeMarker, HpucjswO.efmnaoUshyv);
        return this.f53197e.prepareType(kotlinTypeMarker);
    }
}
