package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p388Pm.C6508b;
import p388Pm.C6509c;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17678l;

/* JADX INFO: loaded from: classes2.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;

    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;
    public static final DescriptorVisibility INHERITED;
    public static final DescriptorVisibility INTERNAL;
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;
    public static final DescriptorVisibility LOCAL;
    public static final DescriptorVisibility PRIVATE;
    public static final DescriptorVisibility PRIVATE_TO_THIS;
    public static final DescriptorVisibility PROTECTED;
    public static final DescriptorVisibility PUBLIC;
    public static final DescriptorVisibility UNKNOWN;

    /* JADX INFO: renamed from: a */
    public static final Map f51394a;

    /* JADX INFO: renamed from: b */
    public static final C6508b f51395b;

    /* JADX INFO: renamed from: c */
    public static final ModuleVisibilityHelper f51396c;

    /* JADX INFO: renamed from: d */
    public static final HashMap f51397d;

    static {
        C6509c c6509c = new C6509c(Visibilities.Private.INSTANCE, 0);
        PRIVATE = c6509c;
        C6509c c6509c2 = new C6509c(Visibilities.PrivateToThis.INSTANCE, 1);
        PRIVATE_TO_THIS = c6509c2;
        C6509c c6509c3 = new C6509c(Visibilities.Protected.INSTANCE, 2);
        PROTECTED = c6509c3;
        C6509c c6509c4 = new C6509c(Visibilities.Internal.INSTANCE, 3);
        INTERNAL = c6509c4;
        C6509c c6509c5 = new C6509c(Visibilities.Public.INSTANCE, 4);
        PUBLIC = c6509c5;
        C6509c c6509c6 = new C6509c(Visibilities.Local.INSTANCE, 5);
        LOCAL = c6509c6;
        C6509c c6509c7 = new C6509c(Visibilities.Inherited.INSTANCE, 6);
        INHERITED = c6509c7;
        C6509c c6509c8 = new C6509c(Visibilities.InvisibleFake.INSTANCE, 7);
        INVISIBLE_FAKE = c6509c8;
        C6509c c6509c9 = new C6509c(Visibilities.Unknown.INSTANCE, 8);
        UNKNOWN = c6509c9;
        INVISIBLE_FROM_OTHER_MODULES = DesugarCollections.unmodifiableSet(AbstractC17678l.m19293P(new DescriptorVisibility[]{c6509c, c6509c2, c6509c4, c6509c6}));
        HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        mapNewHashMapWithExpectedSize.put(c6509c2, 0);
        mapNewHashMapWithExpectedSize.put(c6509c, 0);
        mapNewHashMapWithExpectedSize.put(c6509c4, 1);
        mapNewHashMapWithExpectedSize.put(c6509c3, 1);
        mapNewHashMapWithExpectedSize.put(c6509c5, 2);
        f51394a = DesugarCollections.unmodifiableMap(mapNewHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = c6509c5;
        f51395b = new C6508b(0);
        ALWAYS_SUITABLE_RECEIVER = new C6508b(1);
        FALSE_IF_PROTECTED = new C6508b(2);
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f51396c = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        f51397d = new HashMap();
        m18125b(c6509c);
        m18125b(c6509c2);
        m18125b(c6509c3);
        m18125b(c6509c4);
        m18125b(c6509c5);
        m18125b(c6509c6);
        m18125b(c6509c7);
        m18125b(c6509c8);
        m18125b(c6509c9);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18124a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i10 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i10) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m18125b(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        f51397d.put(delegatedDescriptorVisibility.getDelegate(), delegatedDescriptorVisibility);
    }

    public static Integer compare(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            m18124a(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            m18124a(13);
            throw null;
        }
        Integer numCompareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (numCompareTo != null) {
            return numCompareTo;
        }
        Integer numCompareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (numCompareTo2 != null) {
            return Integer.valueOf(-numCompareTo2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility findInvisibleMember(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z6) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityFindInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            m18124a(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18124a(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z6)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityFindInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z6)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityFindInvisibleMember;
    }

    public static boolean inSameFile(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            m18124a(6);
            throw null;
        }
        if (declarationDescriptor2 == null) {
            m18124a(7);
            throw null;
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == PRIVATE || descriptorVisibility == PRIVATE_TO_THIS;
        }
        m18124a(14);
        throw null;
    }

    public static boolean isVisibleIgnoringReceiver(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z6) {
        if (declarationDescriptorWithVisibility == null) {
            m18124a(2);
            throw null;
        }
        if (declarationDescriptor != null) {
            return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z6) == null;
        }
        m18124a(3);
        throw null;
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            m18124a(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f51397d.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
