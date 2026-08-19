package com.google.protobuf;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import p002A0.C0138o;
import p370P0.C6277D;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.protobuf.Z */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12133Z extends AbstractC12138b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC12133Z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C12182p1 unknownFields;

    public AbstractC12133Z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C12182p1.f37068f;
    }

    public static C12129X access$000(AbstractC12078C abstractC12078C) {
        abstractC12078C.getClass();
        return (C12129X) abstractC12078C;
    }

    /* JADX INFO: renamed from: b */
    public static void m13877b(AbstractC12133Z abstractC12133Z) throws C12181p0 {
        if (abstractC12133Z == null || abstractC12133Z.isInitialized()) {
            return;
        }
        C12179o1 c12179o1NewUninitializedMessageException = abstractC12133Z.newUninitializedMessageException();
        c12179o1NewUninitializedMessageException.getClass();
        throw new C12181p0(c12179o1NewUninitializedMessageException.getMessage());
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC12133Z m13878c(AbstractC12133Z abstractC12133Z, InputStream inputStream, C12087F c12087f) throws C12181p0 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            AbstractC12186r abstractC12186rM14087i = AbstractC12186r.m14087i(new C12135a(inputStream, AbstractC12186r.m14088x(i10, inputStream)));
            AbstractC12133Z partialFrom = parsePartialFrom(abstractC12133Z, abstractC12186rM14087i, c12087f);
            abstractC12186rM14087i.mo14029a(0);
            return partialFrom;
        } catch (C12181p0 e10) {
            if (e10.f37067Y) {
                throw new C12181p0(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new C12181p0(e11.getMessage(), e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC12133Z m13879d(AbstractC12133Z abstractC12133Z, byte[] bArr, int i10, int i11, C12087F c12087f) throws C12181p0 {
        AbstractC12133Z abstractC12133ZNewMutableInstance = abstractC12133Z.newMutableInstance();
        try {
            InterfaceC12134Z0 interfaceC12134Z0M13869b = C12128W0.f36987c.m13869b(abstractC12133ZNewMutableInstance);
            interfaceC12134Z0M13869b.mo13794h(abstractC12133ZNewMutableInstance, bArr, i10, i10 + i11, new C0138o(c12087f));
            interfaceC12134Z0M13869b.mo13785a(abstractC12133ZNewMutableInstance);
            return abstractC12133ZNewMutableInstance;
        } catch (C12179o1 e10) {
            throw new C12181p0(e10.getMessage());
        } catch (C12181p0 e11) {
            if (e11.f37067Y) {
                throw new C12181p0(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C12181p0) {
                throw ((C12181p0) e12.getCause());
            }
            throw new C12181p0(e12.getMessage(), e12);
        } catch (IndexOutOfBoundsException unused) {
            throw C12181p0.m14066g();
        }
    }

    public static InterfaceC12145d0 emptyBooleanList() {
        return C12159i.f37032p0;
    }

    public static InterfaceC12148e0 emptyDoubleList() {
        return C12198v.f37111p0;
    }

    public static InterfaceC12157h0 emptyFloatList() {
        return C12114P.f36969p0;
    }

    public static InterfaceC12160i0 emptyIntList() {
        return C12142c0.f37022p0;
    }

    public static InterfaceC12169l0 emptyLongList() {
        return C12205x0.f37117p0;
    }

    public static <E> InterfaceC12172m0 emptyProtobufList() {
        return C12130X0.f36994p0;
    }

    public static <T extends AbstractC12133Z> T getDefaultInstance(Class<T> cls) {
        AbstractC12133Z abstractC12133Z = defaultInstanceMap.get(cls);
        if (abstractC12133Z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC12133Z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC12133Z == null) {
            abstractC12133Z = (T) ((AbstractC12133Z) AbstractC12209y1.m14179b(cls)).getDefaultInstanceForType();
            if (abstractC12133Z == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC12133Z);
        }
        return (T) abstractC12133Z;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static InterfaceC12160i0 mutableCopy(InterfaceC12160i0 interfaceC12160i0) {
        int size = interfaceC12160i0.size();
        int i10 = size == 0 ? 10 : size * 2;
        C12142c0 c12142c0 = (C12142c0) interfaceC12160i0;
        if (i10 >= c12142c0.f37024o0) {
            return new C12142c0(Arrays.copyOf(c12142c0.f37023Z, i10), c12142c0.f37024o0);
        }
        throw new IllegalArgumentException();
    }

    public static Object newMessageInfo(InterfaceC12091G0 interfaceC12091G0, String str, Object[] objArr) {
        return new C12132Y0(interfaceC12091G0, str, objArr);
    }

    public static <ContainingType extends InterfaceC12091G0, Type> C12129X newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC12091G0 interfaceC12091G0, InterfaceC12154g0 interfaceC12154g0, int i10, EnumC12101J1 enumC12101J1, boolean z6, Class cls) {
        return new C12129X(containingtype, Collections.emptyList(), interfaceC12091G0, new C12127W(interfaceC12154g0, i10, enumC12101J1, true, z6));
    }

    public static <ContainingType extends InterfaceC12091G0, Type> C12129X newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC12091G0 interfaceC12091G0, InterfaceC12154g0 interfaceC12154g0, int i10, EnumC12101J1 enumC12101J1, Class cls) {
        return new C12129X(containingtype, type, interfaceC12091G0, new C12127W(interfaceC12154g0, i10, enumC12101J1, false, false));
    }

    public static <T extends AbstractC12133Z> T parseDelimitedFrom(T t10, InputStream inputStream) throws C12181p0 {
        T t11 = (T) m13878c(t10, inputStream, C12087F.m13737b());
        m13877b(t11);
        return t11;
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, ByteBuffer byteBuffer, C12087F c12087f) throws C12181p0 {
        AbstractC12186r abstractC12186rM14086h;
        if (byteBuffer.hasArray()) {
            abstractC12186rM14086h = AbstractC12186r.m14086h(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && AbstractC12209y1.f37125d) {
            abstractC12186rM14086h = new C12183q(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC12186rM14086h = AbstractC12186r.m14086h(bArr, 0, iRemaining, true);
        }
        T t11 = (T) parseFrom(t10, abstractC12186rM14086h, c12087f);
        m13877b(t11);
        return t11;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static <T extends AbstractC12133Z> T parsePartialFrom(T t10, AbstractC12186r abstractC12186r, C12087F c12087f) throws C12181p0 {
        T t11 = (T) t10.newMutableInstance();
        try {
            InterfaceC12134Z0 interfaceC12134Z0M13869b = C12128W0.f36987c.m13869b(t11);
            C6277D c6277d = abstractC12186r.f37095b;
            if (c6277d == null) {
                c6277d = new C6277D(abstractC12186r);
            }
            interfaceC12134Z0M13869b.mo13796j(t11, c6277d, c12087f);
            interfaceC12134Z0M13869b.mo13785a(t11);
            return t11;
        } catch (C12179o1 e10) {
            throw new C12181p0(e10.getMessage());
        } catch (C12181p0 e11) {
            if (e11.f37067Y) {
                throw new C12181p0(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C12181p0) {
                throw ((C12181p0) e12.getCause());
            }
            throw new C12181p0(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C12181p0) {
                throw ((C12181p0) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends AbstractC12133Z> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(EnumC12131Y.f36999o0);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        C12128W0 c12128w0 = C12128W0.f36987c;
        c12128w0.getClass();
        return c12128w0.m13868a(getClass()).mo13792f(this);
    }

    public final <MessageType extends AbstractC12133Z, BuilderType extends AbstractC12121T> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(EnumC12131Y.f37001q0);
    }

    public Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj) {
        return dynamicMethod(enumC12131Y, obj, null);
    }

    public abstract Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12128W0 c12128w0 = C12128W0.f36987c;
        c12128w0.getClass();
        return c12128w0.m13868a(getClass()).mo13795i(this, (AbstractC12133Z) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final InterfaceC12124U0 getParserForType() {
        return (InterfaceC12124U0) dynamicMethod(EnumC12131Y.f37003s0);
    }

    @Override // com.google.protobuf.AbstractC12138b
    public int getSerializedSize(InterfaceC12134Z0 interfaceC12134Z0) {
        int iMo13793g;
        int iMo13793g2;
        if (isMutable()) {
            if (interfaceC12134Z0 == null) {
                C12128W0 c12128w0 = C12128W0.f36987c;
                c12128w0.getClass();
                iMo13793g2 = c12128w0.m13868a(getClass()).mo13793g(this);
            } else {
                iMo13793g2 = interfaceC12134Z0.mo13793g(this);
            }
            if (iMo13793g2 >= 0) {
                return iMo13793g2;
            }
            throw new IllegalStateException(AbstractC10763a.m11048f(iMo13793g2, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (interfaceC12134Z0 == null) {
            C12128W0 c12128w1 = C12128W0.f36987c;
            c12128w1.getClass();
            iMo13793g = c12128w1.m13868a(getClass()).mo13793g(this);
        } else {
            iMo13793g = interfaceC12134Z0.mo13793g(this);
        }
        setMemoizedSerializedSize(iMo13793g);
        return iMo13793g;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.InterfaceC12094H0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        C12128W0 c12128w0 = C12128W0.f36987c;
        c12128w0.getClass();
        c12128w0.m13868a(getClass()).mo13785a(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i10, AbstractC12171m abstractC12171m) {
        if (this.unknownFields == C12182p1.f37068f) {
            this.unknownFields = new C12182p1();
        }
        C12182p1 c12182p1 = this.unknownFields;
        c12182p1.m14068a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c12182p1.m14072f((i10 << 3) | 2, abstractC12171m);
    }

    public final void mergeUnknownFields(C12182p1 c12182p1) {
        this.unknownFields = C12182p1.m14067e(this.unknownFields, c12182p1);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == C12182p1.f37068f) {
            this.unknownFields = new C12182p1();
        }
        C12182p1 c12182p1 = this.unknownFields;
        c12182p1.m14068a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        c12182p1.m14072f(i10 << 3, Long.valueOf(i11));
    }

    public AbstractC12133Z newMutableInstance() {
        return (AbstractC12133Z) dynamicMethod(EnumC12131Y.f37000p0);
    }

    public boolean parseUnknownField(int i10, AbstractC12186r abstractC12186r) {
        if ((i10 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == C12182p1.f37068f) {
            this.unknownFields = new C12182p1();
        }
        return this.unknownFields.m14071d(i10, abstractC12186r);
    }

    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    public void setMemoizedSerializedSize(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(AbstractC10763a.m11048f(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = AbstractC12097I0.f36889a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        AbstractC12097I0.m13750c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.protobuf.InterfaceC12091G0
    public void writeTo(AbstractC12195u abstractC12195u) {
        C12128W0 c12128w0 = C12128W0.f36987c;
        c12128w0.getClass();
        InterfaceC12134Z0 interfaceC12134Z0M13868a = c12128w0.m13868a(getClass());
        C12211z0 c12211z0 = abstractC12195u.f37110c;
        if (c12211z0 == null) {
            c12211z0 = new C12211z0(abstractC12195u);
        }
        interfaceC12134Z0M13868a.mo13791e(this, c12211z0);
    }

    public static final <T extends AbstractC12133Z> boolean isInitialized(T t10, boolean z6) {
        byte bByteValue = ((Byte) t10.dynamicMethod(EnumC12131Y.f36997Y)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C12128W0 c12128w0 = C12128W0.f36987c;
        c12128w0.getClass();
        boolean zMo13787b = c12128w0.m13868a(t10.getClass()).mo13787b(t10);
        if (z6) {
            t10.dynamicMethod(EnumC12131Y.f36998Z, zMo13787b ? t10 : null);
        }
        return zMo13787b;
    }

    public final <MessageType extends AbstractC12133Z, BuilderType extends AbstractC12121T> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.m13865f(messagetype);
        return buildertype;
    }

    public Object dynamicMethod(EnumC12131Y enumC12131Y) {
        return dynamicMethod(enumC12131Y, null, null);
    }

    @Override // com.google.protobuf.InterfaceC12094H0
    public final AbstractC12133Z getDefaultInstanceForType() {
        return (AbstractC12133Z) dynamicMethod(EnumC12131Y.f37002r0);
    }

    @Override // com.google.protobuf.InterfaceC12091G0
    public final AbstractC12121T newBuilderForType() {
        return (AbstractC12121T) dynamicMethod(EnumC12131Y.f37001q0);
    }

    @Override // com.google.protobuf.InterfaceC12091G0
    public final AbstractC12121T toBuilder() {
        AbstractC12121T abstractC12121T = (AbstractC12121T) dynamicMethod(EnumC12131Y.f37001q0);
        abstractC12121T.m13865f(this);
        return abstractC12121T;
    }

    public static <T extends AbstractC12133Z> T parseDelimitedFrom(T t10, InputStream inputStream, C12087F c12087f) throws C12181p0 {
        T t11 = (T) m13878c(t10, inputStream, c12087f);
        m13877b(t11);
        return t11;
    }

    public static InterfaceC12169l0 mutableCopy(InterfaceC12169l0 interfaceC12169l0) {
        int size = interfaceC12169l0.size();
        int i10 = size == 0 ? 10 : size * 2;
        C12205x0 c12205x0 = (C12205x0) interfaceC12169l0;
        if (i10 >= c12205x0.f37119o0) {
            return new C12205x0(Arrays.copyOf(c12205x0.f37118Z, i10), c12205x0.f37119o0);
        }
        throw new IllegalArgumentException();
    }

    public static InterfaceC12157h0 mutableCopy(InterfaceC12157h0 interfaceC12157h0) {
        int size = interfaceC12157h0.size();
        int i10 = size == 0 ? 10 : size * 2;
        C12114P c12114p = (C12114P) interfaceC12157h0;
        if (i10 >= c12114p.f36971o0) {
            return new C12114P(Arrays.copyOf(c12114p.f36970Z, i10), c12114p.f36971o0);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, ByteBuffer byteBuffer) {
        return (T) parseFrom(t10, byteBuffer, C12087F.m13737b());
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, AbstractC12171m abstractC12171m) throws C12181p0 {
        T t11 = (T) parseFrom(t10, abstractC12171m, C12087F.m13737b());
        m13877b(t11);
        return t11;
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, AbstractC12171m abstractC12171m, C12087F c12087f) throws C12181p0 {
        AbstractC12186r abstractC12186rMo14004s = abstractC12171m.mo14004s();
        T t11 = (T) parsePartialFrom(t10, abstractC12186rMo14004s, c12087f);
        abstractC12186rMo14004s.mo14029a(0);
        m13877b(t11);
        return t11;
    }

    public static InterfaceC12148e0 mutableCopy(InterfaceC12148e0 interfaceC12148e0) {
        int size = interfaceC12148e0.size();
        int i10 = size == 0 ? 10 : size * 2;
        C12198v c12198v = (C12198v) interfaceC12148e0;
        if (i10 >= c12198v.f37113o0) {
            return new C12198v(Arrays.copyOf(c12198v.f37112Z, i10), c12198v.f37113o0);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, byte[] bArr) throws C12181p0 {
        T t11 = (T) m13879d(t10, bArr, 0, bArr.length, C12087F.m13737b());
        m13877b(t11);
        return t11;
    }

    public static InterfaceC12145d0 mutableCopy(InterfaceC12145d0 interfaceC12145d0) {
        int size = interfaceC12145d0.size();
        int i10 = size == 0 ? 10 : size * 2;
        C12159i c12159i = (C12159i) interfaceC12145d0;
        if (i10 >= c12159i.f37034o0) {
            return new C12159i(Arrays.copyOf(c12159i.f37033Z, i10), c12159i.f37034o0);
        }
        throw new IllegalArgumentException();
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, byte[] bArr, C12087F c12087f) throws C12181p0 {
        T t11 = (T) m13879d(t10, bArr, 0, bArr.length, c12087f);
        m13877b(t11);
        return t11;
    }

    @Override // com.google.protobuf.InterfaceC12091G0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends AbstractC12133Z> T parsePartialFrom(T t10, AbstractC12186r abstractC12186r) {
        return (T) parsePartialFrom(t10, abstractC12186r, C12087F.m13737b());
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, InputStream inputStream) throws C12181p0 {
        T t11 = (T) parsePartialFrom(t10, AbstractC12186r.m14087i(inputStream), C12087F.m13737b());
        m13877b(t11);
        return t11;
    }

    public static <E> InterfaceC12172m0 mutableCopy(InterfaceC12172m0 interfaceC12172m0) {
        int size = interfaceC12172m0.size();
        return interfaceC12172m0.mo13855b(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, InputStream inputStream, C12087F c12087f) throws C12181p0 {
        T t11 = (T) parsePartialFrom(t10, AbstractC12186r.m14087i(inputStream), c12087f);
        m13877b(t11);
        return t11;
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, AbstractC12186r abstractC12186r) {
        return (T) parseFrom(t10, abstractC12186r, C12087F.m13737b());
    }

    public static <T extends AbstractC12133Z> T parseFrom(T t10, AbstractC12186r abstractC12186r, C12087F c12087f) throws C12181p0 {
        T t11 = (T) parsePartialFrom(t10, abstractC12186r, c12087f);
        m13877b(t11);
        return t11;
    }
}
