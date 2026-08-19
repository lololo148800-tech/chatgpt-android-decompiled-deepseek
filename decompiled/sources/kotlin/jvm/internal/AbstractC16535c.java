package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p225Im.EnumC3745D;
import p225Im.InterfaceC3755c;
import p225Im.InterfaceC3758f;
import p225Im.InterfaceC3767o;
import p225Im.InterfaceC3777y;
import p225Im.InterfaceC3778z;

/* JADX INFO: renamed from: kotlin.jvm.internal.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16535c implements InterfaceC3755c, Serializable {
    public static final Object NO_RECEIVER = C16534b.f51277Y;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC3755c reflected;
    private final String signature;

    public AbstractC16535c(Object obj, Class cls, String str, String str2, boolean z6) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z6;
    }

    @Override // p225Im.InterfaceC3755c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p225Im.InterfaceC3755c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC3755c compute() {
        InterfaceC3755c interfaceC3755c = this.reflected;
        if (interfaceC3755c != null) {
            return interfaceC3755c;
        }
        InterfaceC3755c interfaceC3755cComputeReflected = computeReflected();
        this.reflected = interfaceC3755cComputeReflected;
        return interfaceC3755cComputeReflected;
    }

    public abstract InterfaceC3755c computeReflected();

    @Override // p225Im.InterfaceC3754b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p225Im.InterfaceC3755c
    public String getName() {
        return this.name;
    }

    public InterfaceC3758f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? AbstractC16526C.f51263a.mo5694c(cls, "") : AbstractC16526C.f51263a.mo5693b(cls);
    }

    @Override // p225Im.InterfaceC3755c
    public List<InterfaceC3767o> getParameters() {
        return getReflected().getParameters();
    }

    public abstract InterfaceC3755c getReflected();

    @Override // p225Im.InterfaceC3755c
    public InterfaceC3777y getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p225Im.InterfaceC3755c
    public List<InterfaceC3778z> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p225Im.InterfaceC3755c
    public EnumC3745D getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p225Im.InterfaceC3755c
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p225Im.InterfaceC3755c
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p225Im.InterfaceC3755c
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p225Im.InterfaceC3755c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
