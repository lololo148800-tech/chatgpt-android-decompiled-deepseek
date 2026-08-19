package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p732en.C13447d;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C16606c {

    /* JADX INFO: renamed from: d */
    public static final C16606c f52755d = new C16606c(0);

    /* JADX INFO: renamed from: b */
    public boolean f52757b;

    /* JADX INFO: renamed from: c */
    public boolean f52758c = false;

    /* JADX INFO: renamed from: a */
    public final C13447d f52756a = new C13447d(16);

    public C16606c() {
    }

    /* JADX INFO: renamed from: c */
    public static int m18291c(WireFormat.FieldType fieldType, Object obj) {
        switch (AbstractC16605b.f52754b[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 10:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 11:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 17:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m18292d(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            int iComputeTagSize = CodedOutputStream.computeTagSize(number);
            if (liteType == WireFormat.FieldType.GROUP) {
                iComputeTagSize *= 2;
            }
            return m18291c(liteType, obj) + iComputeTagSize;
        }
        int iM18291c = 0;
        if (fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM18291c += m18291c(liteType, it.next());
            }
            return CodedOutputStream.computeRawVarint32Size(iM18291c) + CodedOutputStream.computeTagSize(number) + iM18291c;
        }
        for (Object obj2 : (List) obj) {
            int iComputeTagSize2 = CodedOutputStream.computeTagSize(number);
            if (liteType == WireFormat.FieldType.GROUP) {
                iComputeTagSize2 *= 2;
            }
            iM18291c += m18291c(liteType, obj2) + iComputeTagSize2;
        }
        return iM18291c;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18293g(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (fieldSet$FieldDescriptorLite.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((MessageLite) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof MessageLite)) {
                    if (value instanceof LazyField) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static Object m18294j(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) {
        switch (AbstractC16605b.f52754b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(codedInputStream.readDouble());
            case 2:
                return Float.valueOf(codedInputStream.readFloat());
            case 3:
                return Long.valueOf(codedInputStream.readInt64());
            case 4:
                return Long.valueOf(codedInputStream.readUInt64());
            case 5:
                return Integer.valueOf(codedInputStream.readInt32());
            case 6:
                return Long.valueOf(codedInputStream.readFixed64());
            case 7:
                return Integer.valueOf(codedInputStream.readFixed32());
            case 8:
                return Boolean.valueOf(codedInputStream.readBool());
            case 9:
                return codedInputStream.readString();
            case 10:
                return codedInputStream.readBytes();
            case 11:
                return Integer.valueOf(codedInputStream.readUInt32());
            case 12:
                return Integer.valueOf(codedInputStream.readSFixed32());
            case 13:
                return Long.valueOf(codedInputStream.readSFixed64());
            case 14:
                return Integer.valueOf(codedInputStream.readSInt32());
            case 15:
                return Long.valueOf(codedInputStream.readSInt64());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX INFO: renamed from: l */
    public static void m18295l(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z6 = true;
        boolean z10 = false;
        switch (AbstractC16605b.f52753a[fieldType.getJavaType().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                break;
            case 2:
                z10 = obj instanceof Long;
                break;
            case 3:
                z10 = obj instanceof Float;
                break;
            case 4:
                z10 = obj instanceof Double;
                break;
            case 5:
                z10 = obj instanceof Boolean;
                break;
            case 6:
                z10 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z6 = false;
                }
                z10 = z6;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z6 = false;
                }
                z10 = z6;
                break;
            case 9:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    z6 = false;
                }
                z10 = z6;
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m18296m(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i10, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i10, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i10, fieldType.getWireType());
            m18297n(codedOutputStream, fieldType, obj);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m18297n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (AbstractC16605b.f52754b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeStringNoTag((String) obj);
                break;
            case 10:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 11:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 14:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 17:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m18298a(C16608e c16608e, Object obj) {
        List arrayList;
        if (!c16608e.f52763p0) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m18295l(c16608e.f52762o0, obj);
        Object objM18300e = m18300e(c16608e);
        if (objM18300e == null) {
            arrayList = new ArrayList();
            this.f52756a.put(c16608e, arrayList);
        } else {
            arrayList = (List) objM18300e;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C16606c clone() {
        C13447d c13447d;
        C16606c c16606c = new C16606c();
        int i10 = 0;
        while (true) {
            c13447d = this.f52756a;
            if (i10 >= c13447d.f42580Z.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c13447d.f42580Z.get(i10);
            c16606c.m18304k((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : c13447d.m14971c()) {
            c16606c.m18304k((FieldSet$FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        c16606c.f52758c = this.f52758c;
        return c16606c;
    }

    /* JADX INFO: renamed from: e */
    public final Object m18300e(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite) {
        Object obj = this.f52756a.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m18301f() {
        int i10 = 0;
        while (true) {
            C13447d c13447d = this.f52756a;
            if (i10 >= c13447d.f42580Z.size()) {
                Iterator it = c13447d.m14971c().iterator();
                while (it.hasNext()) {
                    if (!m18293g((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m18293g((Map.Entry) c13447d.f42580Z.get(i10))) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18302h() {
        if (this.f52757b) {
            return;
        }
        C13447d c13447d = this.f52756a;
        if (!c13447d.f42582p0) {
            for (int i10 = 0; i10 < c13447d.f42580Z.size(); i10++) {
                Map.Entry entry = (Map.Entry) c13447d.f42580Z.get(i10);
                if (((FieldSet$FieldDescriptorLite) entry.getKey()).isRepeated()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c13447d.m14971c()) {
                if (((FieldSet$FieldDescriptorLite) entry2.getKey()).isRepeated()) {
                    entry2.setValue(DesugarCollections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c13447d.f42582p0) {
            c13447d.f42581o0 = c13447d.f42581o0.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(c13447d.f42581o0);
            c13447d.f42582p0 = true;
        }
        this.f52757b = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m18303i(Map.Entry entry) {
        FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite = (FieldSet$FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        boolean zIsRepeated = fieldSet$FieldDescriptorLite.isRepeated();
        C13447d c13447d = this.f52756a;
        if (zIsRepeated) {
            Object objM18300e = m18300e(fieldSet$FieldDescriptorLite);
            if (objM18300e == null) {
                objM18300e = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objM18300e;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c13447d.put(fieldSet$FieldDescriptorLite, objM18300e);
            return;
        }
        if (fieldSet$FieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c13447d.put(fieldSet$FieldDescriptorLite, value);
            return;
        }
        Object objM18300e2 = m18300e(fieldSet$FieldDescriptorLite);
        if (objM18300e2 != null) {
            c13447d.put(fieldSet$FieldDescriptorLite, fieldSet$FieldDescriptorLite.internalMergeFrom(((MessageLite) objM18300e2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c13447d.put(fieldSet$FieldDescriptorLite, value);
    }

    /* JADX INFO: renamed from: k */
    public final void m18304k(FieldSet$FieldDescriptorLite fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            m18295l(fieldSet$FieldDescriptorLite.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m18295l(fieldSet$FieldDescriptorLite.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f52758c = true;
        }
        this.f52756a.put(fieldSet$FieldDescriptorLite, obj);
    }

    public C16606c(int i10) {
        m18302h();
    }
}
