package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p025An.C0644w;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p298Lm.C5150L;
import p368Om.C6267c;
import p523V9.AbstractC7877E4;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC3776x[] f51365h = {AbstractC16526C.f51263a.mo5699h(new C16553u(JvmBuiltIns.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: f */
    public InterfaceC1426a f51366f;

    /* JADX INFO: renamed from: g */
    public final NotNullLazyValue f51367g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final Kind FALLBACK;
        public static final Kind FROM_CLASS_LOADER;
        public static final Kind FROM_DEPENDENCIES;

        /* JADX INFO: renamed from: Y */
        public static final /* synthetic */ Kind[] f51368Y;

        static {
            Kind kind = new Kind("FROM_DEPENDENCIES", 0);
            FROM_DEPENDENCIES = kind;
            Kind kind2 = new Kind("FROM_CLASS_LOADER", 1);
            FROM_CLASS_LOADER = kind2;
            Kind kind3 = new Kind("FALLBACK", 2);
            FALLBACK = kind3;
            Kind[] kindArr = {kind, kind2, kind3};
            f51368Y = kindArr;
            AbstractC7877E4.m8156j(kindArr);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f51368Y.clone();
        }
    }

    public static final class Settings {

        /* JADX INFO: renamed from: a */
        public final ModuleDescriptor f51369a;

        /* JADX INFO: renamed from: b */
        public final boolean f51370b;

        public Settings(ModuleDescriptor ownerModuleDescriptor, boolean z6) {
            AbstractC16544l.m18094g(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f51369a = ownerModuleDescriptor;
            this.f51370b = z6;
        }

        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.f51369a;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.f51370b;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(StorageManager storageManager, Kind kind) {
        super(storageManager);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(kind, "kind");
        this.f51367g = storageManager.createLazyValue(new C5150L(this, 5, storageManager));
        int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                m18109c(false);
            } else {
                if (i10 != 3) {
                    throw new C0644w();
                }
                m18109c(true);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* JADX INFO: renamed from: d */
    public final AdditionalClassPartsProvider mo18110d() {
        return getCustomizer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* JADX INFO: renamed from: f */
    public final PlatformDependentDeclarationFilter mo6752f() {
        return getCustomizer();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    public Iterable getClassDescriptorFactories() {
        Iterable classDescriptorFactories = super.getClassDescriptorFactories();
        AbstractC16544l.m18093f(classDescriptorFactories, "getClassDescriptorFactories(...)");
        StorageManager storageManager = this.f51299e;
        if (storageManager == null) {
            KotlinBuiltIns.m18104a(6);
            throw null;
        }
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        AbstractC16544l.m18093f(builtInsModule, "getBuiltInsModule(...)");
        return AbstractC17680n.m19360j0(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManager, builtInsModule, null, 4, null));
    }

    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.f51367g, this, f51365h[0]);
    }

    public final void initialize(ModuleDescriptor moduleDescriptor, boolean z6) {
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        setPostponedSettingsComputation(new C6267c(moduleDescriptor, z6));
    }

    public final void setPostponedSettingsComputation(InterfaceC1426a computation) {
        AbstractC16544l.m18094g(computation, "computation");
        this.f51366f = computation;
    }
}
