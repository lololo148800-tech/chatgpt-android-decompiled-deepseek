package p817j$.time.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import p817j$.time.LocalDate;
import p817j$.time.LocalTime;
import p817j$.time.ZoneId;
import p817j$.time.ZoneOffset;
import p817j$.time.temporal.AbstractC15632l;
import p817j$.time.temporal.EnumC15621a;

/* JADX INFO: renamed from: j$.time.chrono.D */
/* JADX INFO: loaded from: classes4.dex */
final class C15539D implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a */
    private byte f48549a;

    /* JADX INFO: renamed from: b */
    private Object f48550b;

    public C15539D() {
    }

    C15539D(byte b, Object obj) {
        this.f48549a = b;
        this.f48550b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.f48549a;
        Object obj = this.f48550b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((AbstractC15545a) obj).getId());
                return;
            case 2:
                ((C15549e) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((C15554j) obj).writeExternal(objectOutput);
                return;
            case 4:
                C15567w c15567w = (C15567w) obj;
                c15567w.getClass();
                objectOutput.writeInt(AbstractC15632l.m17155a(c15567w, EnumC15621a.YEAR));
                objectOutput.writeByte(AbstractC15632l.m17155a(c15567w, EnumC15621a.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC15632l.m17155a(c15567w, EnumC15621a.DAY_OF_MONTH));
                return;
            case 5:
                ((C15568x) obj).m16998G(objectOutput);
                return;
            case 6:
                ((C15560p) obj).writeExternal(objectOutput);
                return;
            case 7:
                C15537B c15537b = (C15537B) obj;
                c15537b.getClass();
                objectOutput.writeInt(AbstractC15632l.m17155a(c15537b, EnumC15621a.YEAR));
                objectOutput.writeByte(AbstractC15632l.m17155a(c15537b, EnumC15621a.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC15632l.m17155a(c15537b, EnumC15621a.DAY_OF_MONTH));
                return;
            case 8:
                C15543H c15543h = (C15543H) obj;
                c15543h.getClass();
                objectOutput.writeInt(AbstractC15632l.m17155a(c15543h, EnumC15621a.YEAR));
                objectOutput.writeByte(AbstractC15632l.m17155a(c15543h, EnumC15621a.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC15632l.m17155a(c15543h, EnumC15621a.DAY_OF_MONTH));
                return;
            case 9:
                ((C15550f) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objM16931q;
        byte b = objectInput.readByte();
        this.f48549a = b;
        switch (b) {
            case 1:
                int i10 = AbstractC15545a.f48559c;
                objM16931q = AbstractC15545a.m16931q(objectInput.readUTF());
                break;
            case 2:
                objM16931q = ((ChronoLocalDate) objectInput.readObject()).mo16822w((LocalTime) objectInput.readObject());
                break;
            case 3:
                objM16931q = ((ChronoLocalDateTime) objectInput.readObject()).mo16845n((ZoneOffset) objectInput.readObject()).mo16905j((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = C15567w.f48600d;
                int i11 = objectInput.readInt();
                byte b10 = objectInput.readByte();
                byte b11 = objectInput.readByte();
                C15565u.f48598d.getClass();
                objM16931q = new C15567w(LocalDate.m16800of(i11, b10, b11));
                break;
            case 5:
                C15568x c15568x = C15568x.f48604d;
                objM16931q = C15568x.m16995v(objectInput.readByte());
                break;
            case 6:
                C15558n c15558n = (C15558n) objectInput.readObject();
                int i12 = objectInput.readInt();
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                c15558n.getClass();
                objM16931q = C15560p.m16981V(c15558n, i12, b12, b13);
                break;
            case 7:
                int i13 = objectInput.readInt();
                byte b14 = objectInput.readByte();
                byte b15 = objectInput.readByte();
                C15570z.f48610d.getClass();
                objM16931q = new C15537B(LocalDate.m16800of(i13 + 1911, b14, b15));
                break;
            case 8:
                int i14 = objectInput.readInt();
                byte b16 = objectInput.readByte();
                byte b17 = objectInput.readByte();
                C15541F.f48552d.getClass();
                objM16931q = new C15543H(LocalDate.m16800of(i14 - 543, b16, b17));
                break;
            case 9:
                int i15 = C15550f.f48564e;
                objM16931q = new C15550f(AbstractC15545a.m16931q(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f48550b = objM16931q;
    }

    private Object readResolve() {
        return this.f48550b;
    }
}
