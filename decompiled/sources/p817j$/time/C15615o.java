package p817j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: renamed from: j$.time.o */
/* JADX INFO: loaded from: classes4.dex */
final class C15615o implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a */
    private byte f48740a;

    /* JADX INFO: renamed from: b */
    private Object f48741b;

    public C15615o() {
    }

    C15615o(byte b, Object obj) {
        this.f48740a = b;
        this.f48741b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f48740a;
        Object obj = this.f48741b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).m16786V(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).m16821l0(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).m16865h0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).m16844f0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).m16899X(objectOutput);
                return;
            case 7:
                ((C15620t) obj).m17135V(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).m16887Y(objectOutput);
                return;
            case 9:
                ((C15613m) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((C15617q) obj).m17125T(objectOutput);
                return;
            case 12:
                ((C15619s) obj).m17133W(objectOutput);
                return;
            case 13:
                ((C15610j) obj).m17109Q(objectOutput);
                return;
            case 14:
                ((C15614n) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.f48740a = b;
        this.f48741b = m17120b(b, objectInput);
    }

    /* JADX INFO: renamed from: a */
    static Serializable m17119a(ObjectInput objectInput) {
        return m17120b(objectInput.readByte(), objectInput);
    }

    /* JADX INFO: renamed from: b */
    private static Serializable m17120b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                Duration duration = Duration.f48512c;
                return Duration.m16777u(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.m16800of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.m16852d0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.m16830of(LocalDate.m16800of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m16852d0(objectInput));
            case 6:
                return ZonedDateTime.m16892T(objectInput);
            case 7:
                int i10 = C15620t.f48751d;
                return ZoneId.m16878Q(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.m16885X(objectInput);
            case 9:
                return C15613m.m17111R(objectInput);
            case 10:
                return OffsetDateTime.m16873S(objectInput);
            case 11:
                int i11 = C15617q.f48744b;
                return C15617q.m17121P(objectInput.readInt());
            case 12:
                int i12 = C15619s.f48748c;
                return C15619s.m17127Q(objectInput.readInt(), objectInput.readByte());
            case 13:
                return C15610j.m17108P(objectInput);
            case 14:
                return C15614n.m17116c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f48741b;
    }
}
