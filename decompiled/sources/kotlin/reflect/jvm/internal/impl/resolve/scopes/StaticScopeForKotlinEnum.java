package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.List;
import kn.C16481c;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class StaticScopeForKotlinEnum extends MemberScopeImpl {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC3776x[] f52938e;

    /* JADX INFO: renamed from: a */
    public final ClassDescriptor f52939a;

    /* JADX INFO: renamed from: b */
    public final boolean f52940b;

    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue f52941c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f52942d;

    static {
        C16553u c16553u = new C16553u(StaticScopeForKotlinEnum.class, "functions", "getFunctions()Ljava/util/List;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f52938e = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(StaticScopeForKotlinEnum.class, DiagnosticsEntry.PROPERTIES_KEY, "getProperties()Ljava/util/List;", 0, c16527d)};
    }

    public StaticScopeForKotlinEnum(StorageManager storageManager, ClassDescriptor containingClass, boolean z6) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(containingClass, "containingClass");
        this.f52939a = containingClass;
        this.f52940b = z6;
        containingClass.getKind();
        ClassKind classKind = ClassKind.CLASS;
        this.f52941c = storageManager.createLazyValue(new C16481c(this, 0));
        this.f52942d = storageManager.createLazyValue(new C16481c(this, 1));
    }

    public Void getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        List list = (List) StorageKt.getValue(this.f52942d, this, f52938e[1]);
        SmartList smartList = new SmartList();
        for (Object obj : list) {
            if (AbstractC16544l.m18089b(((PropertyDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return (ClassifierDescriptor) getContributedClassifier(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<CallableMemberDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        InterfaceC3776x[] interfaceC3776xArr = f52938e;
        return AbstractC17680n.m19361k0((List) StorageKt.getValue(this.f52942d, this, interfaceC3776xArr[1]), (List) StorageKt.getValue(this.f52941c, this, interfaceC3776xArr[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public SmartList<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        List list = (List) StorageKt.getValue(this.f52941c, this, f52938e[0]);
        SmartList<SimpleFunctionDescriptor> smartList = new SmartList<>();
        for (Object obj : list) {
            if (AbstractC16544l.m18089b(((SimpleFunctionDescriptor) obj).getName(), name)) {
                smartList.add(obj);
            }
        }
        return smartList;
    }
}
