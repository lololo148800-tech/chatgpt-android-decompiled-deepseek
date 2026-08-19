package p817j$.time.zone;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import p817j$.time.ZoneOffset;

/* JADX INFO: renamed from: j$.time.zone.a */
/* JADX INFO: loaded from: classes4.dex */
final class C15641a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a */
    private byte f48817a;

    /* JADX INFO: renamed from: b */
    private Serializable f48818b;

    public C15641a() {
    }

    C15641a(byte b, Serializable serializable) {
        this.f48817a = b;
        this.f48818b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f48817a;
        Serializable serializable = this.f48818b;
        objectOutput.writeByte(b);
        if (b == 1) {
            ((ZoneRules) serializable).writeExternal(objectOutput);
            return;
        }
        if (b == 2) {
            ((C15642b) serializable).writeExternal(objectOutput);
        } else if (b == 3) {
            ((C15645e) serializable).writeExternal(objectOutput);
        } else {
            if (b == 100) {
                ((ZoneRules) serializable).m17210k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable serializableM17206j;
        byte b = objectInput.readByte();
        this.f48817a = b;
        if (b == 1) {
            serializableM17206j = ZoneRules.m17206j(objectInput);
        } else if (b == 2) {
            long jM17211a = m17211a(objectInput);
            ZoneOffset zoneOffsetM17212b = m17212b(objectInput);
            ZoneOffset zoneOffsetM17212b2 = m17212b(objectInput);
            if (zoneOffsetM17212b.equals(zoneOffsetM17212b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            serializableM17206j = new C15642b(jM17211a, zoneOffsetM17212b, zoneOffsetM17212b2);
        } else if (b == 3) {
            serializableM17206j = C15645e.m17223b(objectInput);
        } else {
            if (b != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            serializableM17206j = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f48818b = serializableM17206j;
    }

    private Object readResolve() {
        return this.f48818b;
    }

    /* JADX INFO: renamed from: d */
    static void m17214d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i10 = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        objectOutput.writeByte(i10);
        if (i10 == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    /* JADX INFO: renamed from: b */
    static ZoneOffset m17212b(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        return b == 127 ? ZoneOffset.ofTotalSeconds(objectInput.readInt()) : ZoneOffset.ofTotalSeconds(b * 900);
    }

    /* JADX INFO: renamed from: c */
    static void m17213c(long j10, ObjectOutput objectOutput) {
        if (j10 >= -4575744000L && j10 < 10413792000L && j10 % 900 == 0) {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            objectOutput.writeByte((i10 >>> 16) & 255);
            objectOutput.writeByte((i10 >>> 8) & 255);
            objectOutput.writeByte(i10 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j10);
    }

    /* JADX INFO: renamed from: a */
    static long m17211a(ObjectInput objectInput) {
        int i10 = objectInput.readByte() & 255;
        if (i10 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i10 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
