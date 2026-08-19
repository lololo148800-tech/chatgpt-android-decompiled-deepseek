package p368Om;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Om.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6266b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C6266b f20360Y = new C6266b();

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        ModuleDescriptor module = (ModuleDescriptor) obj;
        JvmBuiltInClassDescriptorFactory.Companion companion = JvmBuiltInClassDescriptorFactory.Companion;
        AbstractC16544l.m18094g(module, "module");
        List<PackageFragmentDescriptor> fragments = module.getPackage(JvmBuiltInClassDescriptorFactory.f51359e).getFragments();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : fragments) {
            if (obj2 instanceof BuiltInsPackageFragment) {
                arrayList.add(obj2);
            }
        }
        return (BuiltInsPackageFragment) AbstractC17680n.m19341Q(arrayList);
    }
}
