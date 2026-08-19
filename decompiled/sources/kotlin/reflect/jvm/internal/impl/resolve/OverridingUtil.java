package kotlin.reflect.jvm.internal.impl.resolve;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.statsig.androidsdk.StatsigLoggerKt;
import gn.C14197b;
import gn.C14200e;
import gn.C14201f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p007A5.C0372g;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public class OverridingUtil {
    public static final OverridingUtil DEFAULT;

    /* JADX INFO: renamed from: d */
    public static final List f52848d = AbstractC17680n.m19322C0(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: e */
    public static final C14201f f52849e;

    /* JADX INFO: renamed from: a */
    public final KotlinTypeRefiner f52850a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypePreparator.Default f52851b;

    /* JADX INFO: renamed from: c */
    public final KotlinTypeChecker.TypeConstructorEquality f52852c;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: c */
        public static final OverrideCompatibilityInfo f52853c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a */
        public final Result f52854a;

        /* JADX INFO: renamed from: b */
        public final String f52855b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {
            public static final Result CONFLICT;
            public static final Result INCOMPATIBLE;
            public static final Result OVERRIDABLE;

            /* JADX INFO: renamed from: Y */
            public static final /* synthetic */ Result[] f52856Y;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                OVERRIDABLE = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                INCOMPATIBLE = result2;
                Result result3 = new Result("CONFLICT", 2);
                CONFLICT = result3;
                f52856Y = new Result[]{result, result2, result3};
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) f52856Y.clone();
            }
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                m18357a(3);
                throw null;
            }
            if (str == null) {
                m18357a(4);
                throw null;
            }
            this.f52854a = result;
            this.f52855b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m18357a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 == 1 || i10 == 2) {
                objArr[0] = "debugMessage";
            } else if (i10 == 3) {
                objArr[0] = "success";
            } else if (i10 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i10 == 1) {
                objArr[2] = "incompatible";
            } else if (i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static OverrideCompatibilityInfo conflict(String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.CONFLICT, str);
            }
            m18357a(2);
            throw null;
        }

        public static OverrideCompatibilityInfo incompatible(String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
            }
            m18357a(1);
            throw null;
        }

        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f52853c;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            m18357a(0);
            throw null;
        }

        public Result getResult() {
            Result result = this.f52854a;
            if (result != null) {
                return result;
            }
            m18357a(5);
            throw null;
        }

        public String toString() {
            return this.f52854a + ": " + this.f52855b;
        }
    }

    static {
        C14201f c14201f = new C14201f();
        f52849e = c14201f;
        DEFAULT = new OverridingUtil(c14201f, KotlinTypeRefiner.Default.INSTANCE, KotlinTypePreparator.Default.INSTANCE);
    }

    public OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator.Default r6) {
        if (typeConstructorEquality == null) {
            m18349a(5);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            m18349a(6);
            throw null;
        }
        if (r6 == null) {
            m18349a(7);
            throw null;
        }
        this.f52852c = typeConstructorEquality;
        this.f52850a = kotlinTypeRefiner;
        this.f52851b = r6;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18349a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 93 && i10 != 96 && i10 != 101 && i10 != 42 && i10 != 43) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 93 && i10 != 96 && i10 != 101 && i10 != 42 && i10 != 43) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                objArr[0] = "subTypeParameter";
                break;
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 42 && i10 != 43) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i10) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
            case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case StatsigLoggerKt.MAX_EVENTS /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 93 && i10 != 96 && i10 != 101 && i10 != 42 && i10 != 43) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i10) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i10) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i10) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m18350b(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            m18349a(44);
            throw null;
        }
        if (kotlinType2 == null) {
            m18349a(45);
            throw null;
        }
        if (typeCheckerState == null) {
            m18349a(46);
            throw null;
        }
        if (KotlinTypeKt.isError(kotlinType) && KotlinTypeKt.isError(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
    }

    /* JADX INFO: renamed from: c */
    public static void m18351c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            m18349a(17);
            throw null;
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            m18351c(it.next(), linkedHashSet);
        }
    }

    public static OverridingUtil create(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            m18349a(3);
            throw null;
        }
        if (typeConstructorEquality != null) {
            return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        m18349a(4);
        throw null;
    }

    public static OverridingUtil createWithTypeRefiner(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new OverridingUtil(f52849e, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        m18349a(0);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m18352d(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static void m18353e(Collection collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        Modality modality;
        Modality modality2;
        if (collection == null) {
            m18349a(83);
            throw null;
        }
        if (classDescriptor == null) {
            m18349a(84);
            throw null;
        }
        if (overridingStrategy == 0) {
            m18349a(85);
            throw null;
        }
        Collection<CallableMemberDescriptor> collectionFilterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean zIsEmpty = collectionFilterVisibleFakeOverrides.isEmpty();
        if (!zIsEmpty) {
            collection = collectionFilterVisibleFakeOverrides;
        }
        if (collection == null) {
            m18349a(86);
            throw null;
        }
        if (classDescriptor == null) {
            m18349a(87);
            throw null;
        }
        Iterator it = collection.iterator();
        boolean z6 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (it.hasNext()) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
                int i10 = AbstractC16620a.f52867c[callableMemberDescriptor.getModality().ordinal()];
                if (i10 == 1) {
                    modality2 = Modality.FINAL;
                    if (modality2 == null) {
                        m18349a(88);
                        throw null;
                    }
                } else {
                    if (i10 == 2) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
                    }
                    if (i10 == 3) {
                        z10 = true;
                    } else if (i10 == 4) {
                        z11 = true;
                    }
                }
            } else {
                if (classDescriptor.isExpect() && classDescriptor.getModality() != Modality.ABSTRACT && classDescriptor.getModality() != Modality.SEALED) {
                    z6 = true;
                }
                if (z10 && !z11) {
                    modality2 = Modality.OPEN;
                    if (modality2 == null) {
                        m18349a(89);
                        throw null;
                    }
                } else {
                    if (z10 || !z11) {
                        HashSet hashSet = new HashSet();
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            hashSet.addAll(getOverriddenDeclarations((CallableMemberDescriptor) it2.next()));
                        }
                        Set<CallableMemberDescriptor> setFilterOutOverridden = filterOutOverridden(hashSet);
                        Modality modality3 = classDescriptor.getModality();
                        if (setFilterOutOverridden == null) {
                            m18349a(91);
                            throw null;
                        }
                        if (modality3 == null) {
                            m18349a(92);
                            throw null;
                        }
                        Modality modality4 = Modality.ABSTRACT;
                        for (CallableMemberDescriptor callableMemberDescriptor2 : setFilterOutOverridden) {
                            Modality modality5 = (z6 && callableMemberDescriptor2.getModality() == Modality.ABSTRACT) ? modality3 : callableMemberDescriptor2.getModality();
                            if (modality5.compareTo(modality4) < 0) {
                                modality4 = modality5;
                            }
                        }
                        if (modality4 != null) {
                            modality = modality4;
                            break;
                        } else {
                            m18349a(93);
                            throw null;
                        }
                    }
                    modality2 = z6 ? classDescriptor.getModality() : Modality.ABSTRACT;
                    if (modality2 == null) {
                        m18349a(90);
                        throw null;
                    }
                }
            }
            modality = modality2;
            break;
        }
        CallableMemberDescriptor callableMemberDescriptorCopy = ((CallableMemberDescriptor) selectMostSpecificMember(collection, new C14200e(1))).copy(classDescriptor, modality, zIsEmpty ? DescriptorVisibilities.INVISIBLE_FAKE : DescriptorVisibilities.INHERITED, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(callableMemberDescriptorCopy, collection);
        overridingStrategy.addFakeOverride(callableMemberDescriptorCopy);
    }

    public static <H> Collection<H> extractMembersOverridableInBothWays(H h10, Collection<H> collection, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        if (h10 == null) {
            m18349a(97);
            throw null;
        }
        if (collection == null) {
            m18349a(98);
            throw null;
        }
        if (interfaceC1436k == null) {
            m18349a(99);
            throw null;
        }
        if (interfaceC1436k2 == null) {
            m18349a(100);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h10);
        CallableDescriptor callableDescriptor = (CallableDescriptor) interfaceC1436k.invoke(h10);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) interfaceC1436k.invoke(next);
            if (h10 == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(callableDescriptor, callableDescriptor2);
                if (bothWaysOverridability == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == OverrideCompatibilityInfo.Result.CONFLICT) {
                    interfaceC1436k2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D extends CallableDescriptor> Set<D> filterOutOverridden(Set<D> set) {
        if (set != null) {
            return filterOverrides(set, !set.isEmpty() && DescriptorUtilsKt.isTypeRefinementEnabled(DescriptorUtilsKt.getModule(set.iterator().next())), null, new C14197b(1));
        }
        m18349a(8);
        throw null;
    }

    public static <D> Set<D> filterOverrides(Set<D> set, boolean z6, InterfaceC1426a interfaceC1426a, InterfaceC1439n interfaceC1439n) {
        if (set == null) {
            m18349a(9);
            throw null;
        }
        if (interfaceC1439n == null) {
            m18349a(10);
            throw null;
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D d10 : set) {
            if (interfaceC1426a != null) {
                interfaceC1426a.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(d10);
                    break;
                }
                C17309l c17309l = (C17309l) interfaceC1439n.invoke(d10, it.next());
                CallableDescriptor callableDescriptor = (CallableDescriptor) c17309l.f55136Y;
                CallableDescriptor callableDescriptor2 = (CallableDescriptor) c17309l.f55137Z;
                if (!overrides(callableDescriptor, callableDescriptor2, z6, true)) {
                    if (overrides(callableDescriptor2, callableDescriptor, z6, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<CallableMemberDescriptor> filterVisibleFakeOverrides(ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            m18349a(94);
            throw null;
        }
        if (collection == null) {
            m18349a(95);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
            boolean z6 = false;
            if (!DescriptorVisibilities.isPrivate(callableMemberDescriptor.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(callableMemberDescriptor, classDescriptor, false)) {
                z6 = true;
            }
            if (z6) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static DescriptorVisibility findMaxVisibility(Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            m18349a(107);
            throw null;
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.DEFAULT_VISIBILITY;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                DescriptorVisibility visibility = it.next().getVisibility();
                if (descriptorVisibility != null) {
                    Integer numCompare = DescriptorVisibilities.compare(visibility, descriptorVisibility);
                    if (numCompare == null) {
                        break;
                    }
                    if (numCompare.intValue() > 0) {
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numCompare2 = DescriptorVisibilities.compare(descriptorVisibility, it2.next().getVisibility());
            if (numCompare2 == null || numCompare2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18354g(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            m18349a(71);
            throw null;
        }
        if (kotlinType == null) {
            m18349a(72);
            throw null;
        }
        if (callableDescriptor2 == null) {
            m18349a(73);
            throw null;
        }
        if (kotlinType2 == null) {
            m18349a(74);
            throw null;
        }
        if (typeCheckerState != null) {
            return AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
        }
        m18349a(75);
        throw null;
    }

    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z6;
        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible;
        if (callableDescriptor == null) {
            m18349a(38);
            throw null;
        }
        if (callableDescriptor2 == null) {
            m18349a(39);
            throw null;
        }
        boolean z10 = callableDescriptor instanceof FunctionDescriptor;
        if ((z10 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z6 = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z10 && !z6) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.incompatible("Name mismatch");
        }
        if ((callableDescriptor.getExtensionReceiverParameter() == null) != (callableDescriptor2.getExtensionReceiverParameter() == null)) {
            overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
        } else {
            overrideCompatibilityInfoIncompatible = callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size() ? OverrideCompatibilityInfo.incompatible("Value parameter number mismatch") : null;
        }
        if (overrideCompatibilityInfoIncompatible != null) {
            return overrideCompatibilityInfoIncompatible;
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result getBothWaysOverridability(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = DEFAULT;
        OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        OverrideCompatibilityInfo.Result result3 = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (result == result3 && result2 == result3) {
            return result3;
        }
        OverrideCompatibilityInfo.Result result4 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (result == result4 || result2 == result4) ? result4 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    public static Set<CallableMemberDescriptor> getOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m18349a(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m18351c(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18355h(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            m18349a(67);
            throw null;
        }
        if (callableDescriptor2 != null) {
            Integer numCompare = DescriptorVisibilities.compare(callableDescriptor.getVisibility(), callableDescriptor2.getVisibility());
            return numCompare == null || numCompare.intValue() >= 0;
        }
        m18349a(68);
        throw null;
    }

    public static boolean isMoreSpecific(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            m18349a(65);
            throw null;
        }
        if (callableDescriptor2 == null) {
            m18349a(66);
            throw null;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!m18355h(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateM18356f = DEFAULT.m18356f(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return m18354g(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateM18356f);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
        if (!((setter == null || setter2 == null) ? true : m18355h(setter, setter2))) {
            return false;
        }
        if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
            return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerStateM18356f, returnType.unwrap(), returnType2.unwrap());
        }
        return (propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && m18354g(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateM18356f);
    }

    public static boolean isVisibleForOverride(MemberDescriptor memberDescriptor, MemberDescriptor memberDescriptor2, boolean z6) {
        if (memberDescriptor == null) {
            m18349a(55);
            throw null;
        }
        if (memberDescriptor2 != null) {
            return !DescriptorVisibilities.isPrivate(memberDescriptor2.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor, z6);
        }
        m18349a(56);
        throw null;
    }

    public static <D extends CallableDescriptor> boolean overrides(D d10, D d11, boolean z6, boolean z10) {
        if (d10 == null) {
            m18349a(13);
            throw null;
        }
        if (d11 == null) {
            m18349a(14);
            throw null;
        }
        if (!d10.equals(d11) && DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d10.getOriginal(), d11.getOriginal(), z6, z10)) {
            return true;
        }
        CallableDescriptor original = d11.getOriginal();
        Iterator it = DescriptorUtils.getAllOverriddenDescriptors(d10).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, (CallableDescriptor) it.next(), z6, z10)) {
                return true;
            }
        }
        return false;
    }

    public static void resolveUnknownVisibilityForMember(CallableMemberDescriptor callableMemberDescriptor, InterfaceC1436k interfaceC1436k) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            m18349a(105);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, interfaceC1436k);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.INHERITED) {
            return;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        DescriptorVisibility descriptorVisibilityFindMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (descriptorVisibilityFindMaxVisibility == null) {
            descriptorVisibilityFindMaxVisibility = null;
            break;
        }
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            for (CallableMemberDescriptor callableMemberDescriptor3 : overriddenDescriptors) {
                if (callableMemberDescriptor3.getModality() != Modality.ABSTRACT && !callableMemberDescriptor3.getVisibility().equals(descriptorVisibilityFindMaxVisibility)) {
                    descriptorVisibilityFindMaxVisibility = null;
                    break;
                }
            }
        } else {
            descriptorVisibilityFindMaxVisibility = descriptorVisibilityFindMaxVisibility.normalize();
        }
        if (descriptorVisibilityFindMaxVisibility == null) {
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(callableMemberDescriptor);
            }
            descriptorVisibility = DescriptorVisibilities.PUBLIC;
        } else {
            descriptorVisibility = descriptorVisibilityFindMaxVisibility;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            ((PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
            Iterator<PropertyAccessorDescriptor> it = ((PropertyDescriptor) callableMemberDescriptor).getAccessors().iterator();
            while (it.hasNext()) {
                resolveUnknownVisibilityForMember(it.next(), descriptorVisibilityFindMaxVisibility == null ? null : interfaceC1436k);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
            return;
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.setVisibility(descriptorVisibility);
        if (descriptorVisibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
            propertyAccessorDescriptorImpl.setDefault(false);
        }
    }

    public static <H> H selectMostSpecificMember(Collection<H> collection, InterfaceC1436k transform) {
        H h10;
        if (collection == null) {
            m18349a(76);
            throw null;
        }
        if (transform == null) {
            m18349a(77);
            throw null;
        }
        if (collection.size() == 1) {
            H h11 = (H) AbstractC17680n.m19340P(collection);
            if (h11 != null) {
                return h11;
            }
            m18349a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        AbstractC16544l.m18094g(transform, "transform");
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(transform.invoke(it.next()));
        }
        H h12 = (H) AbstractC17680n.m19340P(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) transform.invoke(h12);
        for (H h13 : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) transform.invoke(h13);
            if (callableDescriptor2 == null) {
                m18349a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(h13);
                    break;
                }
            } while (isMoreSpecific(callableDescriptor2, (CallableDescriptor) it2.next()));
            if (isMoreSpecific(callableDescriptor2, callableDescriptor) && !isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                h12 = h13;
            }
        }
        if (arrayList.isEmpty()) {
            if (h12 != null) {
                return h12;
            }
            m18349a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h14 = (H) AbstractC17680n.m19340P(arrayList);
            if (h14 != null) {
                return h14;
            }
            m18349a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                h10 = null;
                break;
            }
            h10 = (H) it3.next();
        } while (FlexibleTypesKt.isFlexible(((CallableDescriptor) transform.invoke(h10)).getReturnType()));
        if (h10 != null) {
            return h10;
        }
        H h15 = (H) AbstractC17680n.m19340P(arrayList);
        if (h15 != null) {
            return h15;
        }
        m18349a(82);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final TypeCheckerState m18356f(List list, List list2) {
        if (list == null) {
            m18349a(40);
            throw null;
        }
        if (list2 == null) {
            m18349a(41);
            throw null;
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateNewTypeCheckerState = new OverridingUtilTypeSystemContext(null, this.f52852c, this.f52850a, this.f52851b, null).newTypeCheckerState(true, true);
            if (typeCheckerStateNewTypeCheckerState != null) {
                return typeCheckerStateNewTypeCheckerState;
            }
            m18349a(42);
            throw null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(((TypeParameterDescriptor) list.get(i10)).getTypeConstructor(), ((TypeParameterDescriptor) list2.get(i10)).getTypeConstructor());
        }
        TypeCheckerState typeCheckerStateNewTypeCheckerState2 = new OverridingUtilTypeSystemContext(map, this.f52852c, this.f52850a, this.f52851b, null).newTypeCheckerState(true, true);
        if (typeCheckerStateNewTypeCheckerState2 != null) {
            return typeCheckerStateNewTypeCheckerState2;
        }
        m18349a(43);
        throw null;
    }

    public void generateOverridesInFunctionGroup(Name name, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (name == null) {
            m18349a(50);
            throw null;
        }
        if (collection == null) {
            m18349a(51);
            throw null;
        }
        if (collection2 == null) {
            m18349a(52);
            throw null;
        }
        if (classDescriptor == null) {
            m18349a(53);
            throw null;
        }
        if (overridingStrategy == null) {
            m18349a(54);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor callableMemberDescriptor : collection2) {
            if (callableMemberDescriptor == null) {
                m18349a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            SmartSet smartSetCreate = SmartSet.create();
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                OverrideCompatibilityInfo.Result result = isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
                boolean zIsVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2, false);
                int i10 = AbstractC16620a.f52866b[result.ordinal()];
                if (i10 == 1) {
                    if (zIsVisibleForOverride) {
                        smartSetCreate.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (i10 == 2) {
                    if (zIsVisibleForOverride) {
                        overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, smartSetCreate);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            DeclarationDescriptor containingDeclaration = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).getContainingDeclaration();
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (((CallableMemberDescriptor) it.next()).getContainingDeclaration() != containingDeclaration) {
                        LinkedList linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            CallableMemberDescriptor callableMemberDescriptorFindMemberWithMaxVisibility = VisibilityUtilKt.findMemberWithMaxVisibility(linkedList);
                            if (callableMemberDescriptorFindMemberWithMaxVisibility == null) {
                                m18349a(102);
                                throw null;
                            }
                            m18353e(extractMembersOverridableInBothWays(callableMemberDescriptorFindMemberWithMaxVisibility, linkedList, new C14200e(2), new C0372g(overridingStrategy, 7, callableMemberDescriptorFindMemberWithMaxVisibility)), classDescriptor, overridingStrategy);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m18353e(Collections.singleton((CallableMemberDescriptor) it2.next()), classDescriptor, overridingStrategy);
        }
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            m18349a(19);
            throw null;
        }
        if (callableDescriptor2 == null) {
            m18349a(20);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoIsOverridableBy != null) {
            return overrideCompatibilityInfoIsOverridableBy;
        }
        m18349a(21);
        throw null;
    }

    public OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z6) {
        if (callableDescriptor == null) {
            m18349a(28);
            throw null;
        }
        if (callableDescriptor2 == null) {
            m18349a(29);
            throw null;
        }
        OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            return basicOverridabilityProblem;
        }
        ArrayList arrayListM18352d = m18352d(callableDescriptor);
        ArrayList arrayListM18352d2 = m18352d(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < arrayListM18352d.size()) {
                if (!KotlinTypeChecker.DEFAULT.equalTypes((KotlinType) arrayListM18352d.get(i10), (KotlinType) arrayListM18352d2.get(i10))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                    if (overrideCompatibilityInfoIncompatible != null) {
                        return overrideCompatibilityInfoIncompatible;
                    }
                    m18349a(31);
                    throw null;
                }
                i10++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoConflict = OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
            if (overrideCompatibilityInfoConflict != null) {
                return overrideCompatibilityInfoConflict;
            }
            m18349a(32);
            throw null;
        }
        TypeCheckerState typeCheckerStateM18356f = m18356f(typeParameters, typeParameters2);
        int i11 = 0;
        loop1: while (true) {
            if (i11 >= typeParameters.size()) {
                while (i10 < arrayListM18352d.size()) {
                    if (!m18350b((KotlinType) arrayListM18352d.get(i10), (KotlinType) arrayListM18352d2.get(i10), typeCheckerStateM18356f)) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                        if (overrideCompatibilityInfoIncompatible2 != null) {
                            return overrideCompatibilityInfoIncompatible2;
                        }
                        m18349a(34);
                        throw null;
                    }
                    i10++;
                }
                if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoConflict2 = OverrideCompatibilityInfo.conflict("Incompatible suspendability");
                    if (overrideCompatibilityInfoConflict2 != null) {
                        return overrideCompatibilityInfoConflict2;
                    }
                    m18349a(35);
                    throw null;
                }
                if (z6) {
                    KotlinType returnType = callableDescriptor.getReturnType();
                    KotlinType returnType2 = callableDescriptor2.getReturnType();
                    if (returnType != null && returnType2 != null && ((!KotlinTypeKt.isError(returnType2) || !KotlinTypeKt.isError(returnType)) && !AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerStateM18356f, returnType2.unwrap(), returnType.unwrap()))) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoConflict3 = OverrideCompatibilityInfo.conflict("Return type mismatch");
                        if (overrideCompatibilityInfoConflict3 != null) {
                            return overrideCompatibilityInfoConflict3;
                        }
                        m18349a(36);
                        throw null;
                    }
                }
                OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = OverrideCompatibilityInfo.success();
                if (overrideCompatibilityInfoSuccess != null) {
                    return overrideCompatibilityInfoSuccess;
                }
                m18349a(37);
                throw null;
            }
            TypeParameterDescriptor typeParameterDescriptor = typeParameters.get(i11);
            TypeParameterDescriptor typeParameterDescriptor2 = typeParameters2.get(i11);
            if (typeParameterDescriptor == null) {
                m18349a(47);
                throw null;
            }
            if (typeParameterDescriptor2 == null) {
                m18349a(48);
                throw null;
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
            if (upperBounds.size() != arrayList.size()) {
                break;
            }
            for (KotlinType kotlinType : upperBounds) {
                ListIterator listIterator = arrayList.listIterator();
                do {
                    if (!listIterator.hasNext()) {
                        break loop1;
                    }
                } while (!m18350b(kotlinType, (KotlinType) listIterator.next(), typeCheckerStateM18356f));
                listIterator.remove();
            }
            i11++;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible3 = OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
        if (overrideCompatibilityInfoIncompatible3 != null) {
            return overrideCompatibilityInfoIncompatible3;
        }
        m18349a(33);
        throw null;
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z6) {
        if (callableDescriptor == null) {
            m18349a(22);
            throw null;
        }
        if (callableDescriptor2 != null) {
            OverrideCompatibilityInfo overrideCompatibilityInfoIsOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z6);
            boolean z10 = overrideCompatibilityInfoIsOverridableByWithoutExternalConditions.getResult() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
            List<ExternalOverridabilityCondition> list = f52848d;
            for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z10 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                    int i10 = AbstractC16620a.f52865a[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i10 == 1) {
                        z10 = true;
                    } else if (i10 == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible = OverrideCompatibilityInfo.incompatible("External condition");
                        if (overrideCompatibilityInfoIncompatible != null) {
                            return overrideCompatibilityInfoIncompatible;
                        }
                        m18349a(24);
                        throw null;
                    }
                }
            }
            if (!z10) {
                return overrideCompatibilityInfoIsOverridableByWithoutExternalConditions;
            }
            for (ExternalOverridabilityCondition externalOverridabilityCondition2 : list) {
                if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                    int i11 = AbstractC16620a.f52865a[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                    if (i11 == 1) {
                        throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                    }
                    if (i11 == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoIncompatible2 = OverrideCompatibilityInfo.incompatible("External condition");
                        if (overrideCompatibilityInfoIncompatible2 != null) {
                            return overrideCompatibilityInfoIncompatible2;
                        }
                        m18349a(26);
                        throw null;
                    }
                }
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoSuccess = OverrideCompatibilityInfo.success();
            if (overrideCompatibilityInfoSuccess != null) {
                return overrideCompatibilityInfoSuccess;
            }
            m18349a(27);
            throw null;
        }
        m18349a(23);
        throw null;
    }
}
