package p658b5;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p038Ba.AbstractC0865o;
import p228J.AbstractC3794B0;
import p233J4.C4262h;
import p444S4.C6997c;
import p444S4.C6998d;
import p444S4.C7001g;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC7942M5;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: b5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C11231b extends AbstractC0865o {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f33995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11231b(WorkDatabase workDatabase, int i10) {
        super(workDatabase);
        this.f33995d = i10;
    }

    @Override // p038Ba.AbstractC0865o
    /* JADX INFO: renamed from: e */
    public final String mo1932e() {
        switch (this.f33995d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12484s(C4262h c4262h, Object obj) throws Throwable {
        int i10;
        int i11;
        byte[] byteArray;
        switch (this.f33995d) {
            case 0:
                C11230a c11230a = (C11230a) obj;
                c4262h.mo3422c(1, c11230a.f33993a);
                String str = c11230a.f33994b;
                if (str == null) {
                    c4262h.mo3426s0(2);
                    return;
                } else {
                    c4262h.mo3422c(2, str);
                    return;
                }
            case 1:
                C11233d c11233d = (C11233d) obj;
                c4262h.mo3422c(1, c11233d.f33998a);
                c4262h.mo3420V(2, c11233d.f33999b.longValue());
                return;
            case 2:
                C11236g c11236g = (C11236g) obj;
                String str2 = c11236g.f34003a;
                if (str2 == null) {
                    c4262h.mo3426s0(1);
                } else {
                    c4262h.mo3422c(1, str2);
                }
                c4262h.mo3420V(2, c11236g.f34004b);
                c4262h.mo3420V(3, c11236g.f34005c);
                return;
            case 3:
                C11240k c11240k = (C11240k) obj;
                String str3 = c11240k.f34014a;
                if (str3 == null) {
                    c4262h.mo3426s0(1);
                } else {
                    c4262h.mo3422c(1, str3);
                }
                c4262h.mo3422c(2, c11240k.f34015b);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                C11245p c11245p = (C11245p) obj;
                String str4 = c11245p.f34041a;
                int i12 = 1;
                if (str4 == null) {
                    c4262h.mo3426s0(1);
                } else {
                    c4262h.mo3422c(1, str4);
                }
                c4262h.mo3420V(2, AbstractC7881F0.m8172k(c11245p.f34042b));
                String str5 = c11245p.f34043c;
                if (str5 == null) {
                    c4262h.mo3426s0(3);
                } else {
                    c4262h.mo3422c(3, str5);
                }
                String str6 = c11245p.f34044d;
                if (str6 == null) {
                    c4262h.mo3426s0(4);
                } else {
                    c4262h.mo3422c(4, str6);
                }
                byte[] bArrM7402b = C7001g.m7402b(c11245p.f34045e);
                if (bArrM7402b == null) {
                    c4262h.mo3426s0(5);
                } else {
                    c4262h.mo3421Y(5, bArrM7402b);
                }
                byte[] bArrM7402b2 = C7001g.m7402b(c11245p.f34046f);
                if (bArrM7402b2 == null) {
                    c4262h.mo3426s0(6);
                } else {
                    c4262h.mo3421Y(6, bArrM7402b2);
                }
                c4262h.mo3420V(7, c11245p.f34047g);
                c4262h.mo3420V(8, c11245p.f34048h);
                c4262h.mo3420V(9, c11245p.f34049i);
                c4262h.mo3420V(10, c11245p.f34051k);
                int i13 = c11245p.f34052l;
                AbstractC14376f.m15825D(i13, "backoffPolicy");
                int iM24h = AbstractC0010F.m24h(i13);
                if (iM24h == 0) {
                    i10 = 0;
                } else {
                    if (iM24h != 1) {
                        throw new C0644w();
                    }
                    i10 = 1;
                }
                c4262h.mo3420V(11, i10);
                c4262h.mo3420V(12, c11245p.f34053m);
                c4262h.mo3420V(13, c11245p.f34054n);
                c4262h.mo3420V(14, c11245p.f34055o);
                c4262h.mo3420V(15, c11245p.f34056p);
                c4262h.mo3420V(16, c11245p.f34057q ? 1L : 0L);
                int i14 = c11245p.f34058r;
                AbstractC14376f.m15825D(i14, "policy");
                int iM24h2 = AbstractC0010F.m24h(i14);
                if (iM24h2 == 0) {
                    i11 = 0;
                } else {
                    if (iM24h2 != 1) {
                        throw new C0644w();
                    }
                    i11 = 1;
                }
                c4262h.mo3420V(17, i11);
                c4262h.mo3420V(18, c11245p.f34059s);
                c4262h.mo3420V(19, c11245p.f34060t);
                c4262h.mo3420V(20, c11245p.f34061u);
                c4262h.mo3420V(21, c11245p.f34062v);
                c4262h.mo3420V(22, c11245p.f34063w);
                C6998d c6998d = c11245p.f34050j;
                if (c6998d == null) {
                    c4262h.mo3426s0(23);
                    c4262h.mo3426s0(24);
                    c4262h.mo3426s0(25);
                    c4262h.mo3426s0(26);
                    c4262h.mo3426s0(27);
                    c4262h.mo3426s0(28);
                    c4262h.mo3426s0(29);
                    c4262h.mo3426s0(30);
                    return;
                }
                int i15 = c6998d.f22392a;
                AbstractC14376f.m15825D(i15, "networkType");
                int iM24h3 = AbstractC0010F.m24h(i15);
                if (iM24h3 == 0) {
                    i12 = 0;
                } else if (iM24h3 != 1) {
                    if (iM24h3 == 2) {
                        i12 = 2;
                    } else if (iM24h3 == 3) {
                        i12 = 3;
                    } else if (iM24h3 == 4) {
                        i12 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i15 != 6) {
                            throw new IllegalArgumentException("Could not convert " + AbstractC3794B0.m4475J(i15) + " to int");
                        }
                        i12 = 5;
                    }
                }
                c4262h.mo3420V(23, i12);
                c4262h.mo3420V(24, c6998d.f22393b ? 1L : 0L);
                c4262h.mo3420V(25, c6998d.f22394c ? 1L : 0L);
                c4262h.mo3420V(26, c6998d.f22395d ? 1L : 0L);
                c4262h.mo3420V(27, c6998d.f22396e ? 1L : 0L);
                c4262h.mo3420V(28, c6998d.f22397f);
                c4262h.mo3420V(29, c6998d.f22398g);
                Set<C6997c> triggers = c6998d.f22399h;
                AbstractC16544l.m18094g(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (C6997c c6997c : triggers) {
                                objectOutputStream.writeUTF(c6997c.f22389a.toString());
                                objectOutputStream.writeBoolean(c6997c.f22390b);
                            }
                            AbstractC7942M5.m8232a(objectOutputStream, null);
                            AbstractC7942M5.m8232a(byteArrayOutputStream, null);
                            byteArray = byteArrayOutputStream.toByteArray();
                            AbstractC16544l.m18093f(byteArray, "outputStream.toByteArray()");
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC7942M5.m8232a(objectOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            AbstractC7942M5.m8232a(byteArrayOutputStream, th4);
                            throw th5;
                        }
                    }
                }
                c4262h.mo3421Y(30, byteArray);
                return;
            default:
                C11247r c11247r = (C11247r) obj;
                String str7 = c11247r.f34078a;
                if (str7 == null) {
                    c4262h.mo3426s0(1);
                } else {
                    c4262h.mo3422c(1, str7);
                }
                c4262h.mo3422c(2, c11247r.f34079b);
                return;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12485t(Object obj) {
        C4262h c4262hM1928a = m1928a();
        try {
            m12484s(c4262hM1928a, obj);
            c4262hM1928a.m5033a();
        } finally {
            m1942o(c4262hM1928a);
        }
    }
}
