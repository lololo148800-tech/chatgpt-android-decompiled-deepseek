package p436Rm;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1436k;
import p298Lm.C5140G;

/* JADX INFO: renamed from: Rm.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C6940f extends MemberScopeImpl {

    /* JADX INFO: renamed from: a */
    public final MemoizedFunctionToNotNull f22224a;

    /* JADX INFO: renamed from: b */
    public final MemoizedFunctionToNotNull f22225b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f22226c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ EnumEntrySyntheticClassDescriptor f22227d;

    public C6940f(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
        if (storageManager == null) {
            m7326a(0);
            throw null;
        }
        this.f22227d = enumEntrySyntheticClassDescriptor;
        this.f22224a = storageManager.createMemoizedFunction(new C6938d(this, 0));
        this.f22225b = storageManager.createMemoizedFunction(new C6938d(this, 1));
        this.f22226c = storageManager.createLazyValue(new C5140G(this, 12));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7326a(int i10) {
        String str;
        int i11;
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i10 == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i10 == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i10 != 12) {
            switch (i10) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case 16:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 7 && i10 != 9 && i10 != 12) {
            switch (i10) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet m7327b(Name name, Collection collection) {
        if (name == null) {
            m7326a(10);
            throw null;
        }
        if (collection == null) {
            m7326a(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name, collection, Collections.emptySet(), this.f22227d, new C6939e(linkedHashSet));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set getClassifierNames() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        m7326a(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, InterfaceC1436k interfaceC1436k) {
        if (descriptorKindFilter == null) {
            m7326a(13);
            throw null;
        }
        if (interfaceC1436k == null) {
            m7326a(14);
            throw null;
        }
        Collection collection = (Collection) this.f22226c.invoke();
        if (collection != null) {
            return collection;
        }
        m7326a(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedFunctions(Name name, LookupLocation lookupLocation) {
        if (name == null) {
            m7326a(5);
            throw null;
        }
        if (lookupLocation == null) {
            m7326a(6);
            throw null;
        }
        Collection collection = (Collection) this.f22224a.invoke(name);
        if (collection != null) {
            return collection;
        }
        m7326a(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection getContributedVariables(Name name, LookupLocation lookupLocation) {
        if (name == null) {
            m7326a(1);
            throw null;
        }
        if (lookupLocation == null) {
            m7326a(2);
            throw null;
        }
        Collection collection = (Collection) this.f22225b.invoke(name);
        if (collection != null) {
            return collection;
        }
        m7326a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set getFunctionNames() {
        Set set = (Set) this.f22227d.f51499v0.invoke();
        if (set != null) {
            return set;
        }
        m7326a(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set getVariableNames() {
        Set set = (Set) this.f22227d.f51499v0.invoke();
        if (set != null) {
            return set;
        }
        m7326a(19);
        throw null;
    }
}
