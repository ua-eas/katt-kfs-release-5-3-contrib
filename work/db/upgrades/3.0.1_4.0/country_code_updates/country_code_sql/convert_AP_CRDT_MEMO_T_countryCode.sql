--
-- The Kuali Financial System, a comprehensive financial management system for higher education.
-- 
-- Copyright 2005-2014 The Kuali Foundation
-- 
-- This program is free software: you can redistribute it and/or modify
-- it under the terms of the GNU Affero General Public License as
-- published by the Free Software Foundation, either version 3 of the
-- License, or (at your option) any later version.
-- 
-- This program is distributed in the hope that it will be useful,
-- but WITHOUT ANY WARRANTY; without even the implied warranty of
-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
-- GNU Affero General Public License for more details.
-- 
-- You should have received a copy of the GNU Affero General Public License
-- along with this program.  If not, see <http://www.gnu.org/licenses/>.
--

-- This script will migrate a column in a table from the former Rice country 
-- codes which were based on FIPS 10-4 (with some minor differences) to the new
-- Rice country codes which are based on ISO 3166-1.  This script may not 
-- properly execute on columns with a primary key or unique constraint as some
-- of the former codes have merged (i.e. - all US Minor Outlying Islands have 
-- been unified under a single code, UM).  This script also does not take any 
-- action on codes that are not part of the list of former Rice country codes.
--
-- Table Name: 	AP_CRDT_MEMO_T
-- Column Name: VNDR_CNTRY_CD
--
-- In order to avoid collisions between the former codes and the new codes, the 
-- codes are first changed to an interim, unique code.  Once that change is 
-- complete, they are changed to the new, correct code.
--
-- Change to temporary code
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='A0' where VNDR_CNTRY_CD='AA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='A1' where VNDR_CNTRY_CD='AC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='A3' where VNDR_CNTRY_CD='AG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='A4' where VNDR_CNTRY_CD='AJ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='A7' where VNDR_CNTRY_CD='AN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='A9' where VNDR_CNTRY_CD='AQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B1' where VNDR_CNTRY_CD='AS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B2' where VNDR_CNTRY_CD='AT';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B3' where VNDR_CNTRY_CD='AU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B4' where VNDR_CNTRY_CD='AV';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B5' where VNDR_CNTRY_CD='AY';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B6' where VNDR_CNTRY_CD='BA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B8' where VNDR_CNTRY_CD='BC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='B9' where VNDR_CNTRY_CD='BD';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C1' where VNDR_CNTRY_CD='BF';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C2' where VNDR_CNTRY_CD='BG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C3' where VNDR_CNTRY_CD='BH';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C4' where VNDR_CNTRY_CD='BK';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C5' where VNDR_CNTRY_CD='BL';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C6' where VNDR_CNTRY_CD='BM';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C7' where VNDR_CNTRY_CD='BN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C8' where VNDR_CNTRY_CD='BO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='C9' where VNDR_CNTRY_CD='BP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='D0' where VNDR_CNTRY_CD='BQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='D2' where VNDR_CNTRY_CD='BS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='D4' where VNDR_CNTRY_CD='BU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='D6' where VNDR_CNTRY_CD='BX';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='D7' where VNDR_CNTRY_CD='BY';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='D9' where VNDR_CNTRY_CD='CB';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E0' where VNDR_CNTRY_CD='CD';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E1' where VNDR_CNTRY_CD='CE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E2' where VNDR_CNTRY_CD='CF';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E3' where VNDR_CNTRY_CD='CG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E4' where VNDR_CNTRY_CD='CH';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E5' where VNDR_CNTRY_CD='CI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E6' where VNDR_CNTRY_CD='CJ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E7' where VNDR_CNTRY_CD='CK';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='E9' where VNDR_CNTRY_CD='CN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='F1' where VNDR_CNTRY_CD='CQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='F2' where VNDR_CNTRY_CD='CR';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='F3' where VNDR_CNTRY_CD='CS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='F4' where VNDR_CNTRY_CD='CT';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='F7' where VNDR_CNTRY_CD='CW';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='F9' where VNDR_CNTRY_CD='CZ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='G0' where VNDR_CNTRY_CD='DA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='G2' where VNDR_CNTRY_CD='DO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='G3' where VNDR_CNTRY_CD='DR';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='G6' where VNDR_CNTRY_CD='EI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='G7' where VNDR_CNTRY_CD='EK';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='G8' where VNDR_CNTRY_CD='EN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='H0' where VNDR_CNTRY_CD='ES';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='H2' where VNDR_CNTRY_CD='EU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='H3' where VNDR_CNTRY_CD='EZ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='H4' where VNDR_CNTRY_CD='FA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='H5' where VNDR_CNTRY_CD='FG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I0' where VNDR_CNTRY_CD='FP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I1' where VNDR_CNTRY_CD='FQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I3' where VNDR_CNTRY_CD='FS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I4' where VNDR_CNTRY_CD='GA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I5' where VNDR_CNTRY_CD='GB';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I6' where VNDR_CNTRY_CD='GE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='I7' where VNDR_CNTRY_CD='GG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='J0' where VNDR_CNTRY_CD='GJ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='J1' where VNDR_CNTRY_CD='GK';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='J3' where VNDR_CNTRY_CD='GM';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='J4' where VNDR_CNTRY_CD='GO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='J6' where VNDR_CNTRY_CD='GQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='J9' where VNDR_CNTRY_CD='GV';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='K1' where VNDR_CNTRY_CD='GZ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='K2' where VNDR_CNTRY_CD='HA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='K5' where VNDR_CNTRY_CD='HO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='K6' where VNDR_CNTRY_CD='HQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='K9' where VNDR_CNTRY_CD='IC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='L4' where VNDR_CNTRY_CD='IP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='L6' where VNDR_CNTRY_CD='IS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='L8' where VNDR_CNTRY_CD='IV';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='L9' where VNDR_CNTRY_CD='IY';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='M0' where VNDR_CNTRY_CD='IZ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='M1' where VNDR_CNTRY_CD='JA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='M4' where VNDR_CNTRY_CD='JN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='M6' where VNDR_CNTRY_CD='JQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='M7' where VNDR_CNTRY_CD='JU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N0' where VNDR_CNTRY_CD='KN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N1' where VNDR_CNTRY_CD='KQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N2' where VNDR_CNTRY_CD='KR';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N3' where VNDR_CNTRY_CD='KS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N4' where VNDR_CNTRY_CD='KT';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N5' where VNDR_CNTRY_CD='KU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N8' where VNDR_CNTRY_CD='LE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='N9' where VNDR_CNTRY_CD='LG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O0' where VNDR_CNTRY_CD='LH';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O1' where VNDR_CNTRY_CD='LI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O2' where VNDR_CNTRY_CD='LO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O3' where VNDR_CNTRY_CD='LQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O4' where VNDR_CNTRY_CD='LS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O5' where VNDR_CNTRY_CD='LT';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O8' where VNDR_CNTRY_CD='MA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='O9' where VNDR_CNTRY_CD='MB';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P0' where VNDR_CNTRY_CD='MC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P2' where VNDR_CNTRY_CD='MF';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P3' where VNDR_CNTRY_CD='MG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P4' where VNDR_CNTRY_CD='MH';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P5' where VNDR_CNTRY_CD='MI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P8' where VNDR_CNTRY_CD='MN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='P9' where VNDR_CNTRY_CD='MO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Q0' where VNDR_CNTRY_CD='MP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Q1' where VNDR_CNTRY_CD='MQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Q4' where VNDR_CNTRY_CD='MU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Q6' where VNDR_CNTRY_CD='MW';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='R0' where VNDR_CNTRY_CD='NA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='R2' where VNDR_CNTRY_CD='NE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='R4' where VNDR_CNTRY_CD='NG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='R5' where VNDR_CNTRY_CD='NH';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='R6' where VNDR_CNTRY_CD='NI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S1' where VNDR_CNTRY_CD='NS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S2' where VNDR_CNTRY_CD='NU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S4' where VNDR_CNTRY_CD='OC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S5' where VNDR_CNTRY_CD='PA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S6' where VNDR_CNTRY_CD='PC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S8' where VNDR_CNTRY_CD='PF';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='S9' where VNDR_CNTRY_CD='PG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='T2' where VNDR_CNTRY_CD='PM';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='T3' where VNDR_CNTRY_CD='PO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='T4' where VNDR_CNTRY_CD='PP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='T5' where VNDR_CNTRY_CD='PS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='T6' where VNDR_CNTRY_CD='PU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='T9' where VNDR_CNTRY_CD='RM';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U1' where VNDR_CNTRY_CD='RP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U2' where VNDR_CNTRY_CD='RQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U3' where VNDR_CNTRY_CD='RS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U6' where VNDR_CNTRY_CD='SB';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U7' where VNDR_CNTRY_CD='SC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U8' where VNDR_CNTRY_CD='SE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='U9' where VNDR_CNTRY_CD='SF';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='V0' where VNDR_CNTRY_CD='SG';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='V5' where VNDR_CNTRY_CD='SN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='V7' where VNDR_CNTRY_CD='SP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='V8' where VNDR_CNTRY_CD='SR';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='V9' where VNDR_CNTRY_CD='ST';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W0' where VNDR_CNTRY_CD='SU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W1' where VNDR_CNTRY_CD='SV';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W2' where VNDR_CNTRY_CD='SW';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W4' where VNDR_CNTRY_CD='SZ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W5' where VNDR_CNTRY_CD='TC';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W6' where VNDR_CNTRY_CD='TD';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W7' where VNDR_CNTRY_CD='TE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='W9' where VNDR_CNTRY_CD='TI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X0' where VNDR_CNTRY_CD='TK';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X1' where VNDR_CNTRY_CD='TL';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X2' where VNDR_CNTRY_CD='TN';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X3' where VNDR_CNTRY_CD='TO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X4' where VNDR_CNTRY_CD='TP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X5' where VNDR_CNTRY_CD='TS';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X6' where VNDR_CNTRY_CD='TU';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='X9' where VNDR_CNTRY_CD='TX';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Y2' where VNDR_CNTRY_CD='UK';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Y3' where VNDR_CNTRY_CD='UP';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Y4' where VNDR_CNTRY_CD='UR';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z0' where VNDR_CNTRY_CD='VI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z1' where VNDR_CNTRY_CD='VM';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z2' where VNDR_CNTRY_CD='VQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z3' where VNDR_CNTRY_CD='VT';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z4' where VNDR_CNTRY_CD='WA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z5' where VNDR_CNTRY_CD='WE';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z7' where VNDR_CNTRY_CD='WI';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='Z8' where VNDR_CNTRY_CD='WQ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='00' where VNDR_CNTRY_CD='WZ';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='01' where VNDR_CNTRY_CD='YM';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='02' where VNDR_CNTRY_CD='YO';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='03' where VNDR_CNTRY_CD='ZA';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='04' where VNDR_CNTRY_CD='ZI';
-- Change to final code
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AW' where VNDR_CNTRY_CD='A0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AG' where VNDR_CNTRY_CD='A1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='DZ' where VNDR_CNTRY_CD='A3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AZ' where VNDR_CNTRY_CD='A4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AD' where VNDR_CNTRY_CD='A7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AS' where VNDR_CNTRY_CD='A9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AU' where VNDR_CNTRY_CD='B1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AU' where VNDR_CNTRY_CD='B2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AT' where VNDR_CNTRY_CD='B3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AI' where VNDR_CNTRY_CD='B4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AQ' where VNDR_CNTRY_CD='B5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BH' where VNDR_CNTRY_CD='B6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BW' where VNDR_CNTRY_CD='B8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BM' where VNDR_CNTRY_CD='B9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BS' where VNDR_CNTRY_CD='C1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BD' where VNDR_CNTRY_CD='C2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BZ' where VNDR_CNTRY_CD='C3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BA' where VNDR_CNTRY_CD='C4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BO' where VNDR_CNTRY_CD='C5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MM' where VNDR_CNTRY_CD='C6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BJ' where VNDR_CNTRY_CD='C7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BY' where VNDR_CNTRY_CD='C8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SB' where VNDR_CNTRY_CD='C9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='D0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TF' where VNDR_CNTRY_CD='D2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BG' where VNDR_CNTRY_CD='D4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BN' where VNDR_CNTRY_CD='D6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='BI' where VNDR_CNTRY_CD='D7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KH' where VNDR_CNTRY_CD='D9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TD' where VNDR_CNTRY_CD='E0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LK' where VNDR_CNTRY_CD='E1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CG' where VNDR_CNTRY_CD='E2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CD' where VNDR_CNTRY_CD='E3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CN' where VNDR_CNTRY_CD='E4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CL' where VNDR_CNTRY_CD='E5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KY' where VNDR_CNTRY_CD='E6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CC' where VNDR_CNTRY_CD='E7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KM' where VNDR_CNTRY_CD='E9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MP' where VNDR_CNTRY_CD='F1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AU' where VNDR_CNTRY_CD='F2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CR' where VNDR_CNTRY_CD='F3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CF' where VNDR_CNTRY_CD='F4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CK' where VNDR_CNTRY_CD='F7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CS' where VNDR_CNTRY_CD='F9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='DK' where VNDR_CNTRY_CD='G0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='DM' where VNDR_CNTRY_CD='G2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='DO' where VNDR_CNTRY_CD='G3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='IE' where VNDR_CNTRY_CD='G6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GQ' where VNDR_CNTRY_CD='G7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='EE' where VNDR_CNTRY_CD='G8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SV' where VNDR_CNTRY_CD='H0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TF' where VNDR_CNTRY_CD='H2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CZ' where VNDR_CNTRY_CD='H3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='FK' where VNDR_CNTRY_CD='H4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GF' where VNDR_CNTRY_CD='H5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PF' where VNDR_CNTRY_CD='I0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='I1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TF' where VNDR_CNTRY_CD='I3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GM' where VNDR_CNTRY_CD='I4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GA' where VNDR_CNTRY_CD='I5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='DE' where VNDR_CNTRY_CD='I6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GE' where VNDR_CNTRY_CD='I7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GD' where VNDR_CNTRY_CD='J0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GG' where VNDR_CNTRY_CD='J1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='DE' where VNDR_CNTRY_CD='J3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TF' where VNDR_CNTRY_CD='J4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GU' where VNDR_CNTRY_CD='J6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GN' where VNDR_CNTRY_CD='J9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PS' where VNDR_CNTRY_CD='K1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='HT' where VNDR_CNTRY_CD='K2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='HN' where VNDR_CNTRY_CD='K5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='K6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='IS' where VNDR_CNTRY_CD='K9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='FR' where VNDR_CNTRY_CD='L4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='IL' where VNDR_CNTRY_CD='L6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CI' where VNDR_CNTRY_CD='L8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NT' where VNDR_CNTRY_CD='L9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='IQ' where VNDR_CNTRY_CD='M0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='JP' where VNDR_CNTRY_CD='M1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NO' where VNDR_CNTRY_CD='M4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='M6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TF' where VNDR_CNTRY_CD='M7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KP' where VNDR_CNTRY_CD='N0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='N1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KI' where VNDR_CNTRY_CD='N2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KR' where VNDR_CNTRY_CD='N3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CX' where VNDR_CNTRY_CD='N4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KW' where VNDR_CNTRY_CD='N5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LB' where VNDR_CNTRY_CD='N8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LV' where VNDR_CNTRY_CD='N9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LT' where VNDR_CNTRY_CD='O0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LR' where VNDR_CNTRY_CD='O1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SK' where VNDR_CNTRY_CD='O2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='O3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LI' where VNDR_CNTRY_CD='O4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LS' where VNDR_CNTRY_CD='O5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MG' where VNDR_CNTRY_CD='O8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MQ' where VNDR_CNTRY_CD='O9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MO' where VNDR_CNTRY_CD='P0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='YT' where VNDR_CNTRY_CD='P2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MN' where VNDR_CNTRY_CD='P3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MS' where VNDR_CNTRY_CD='P4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MW' where VNDR_CNTRY_CD='P5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MC' where VNDR_CNTRY_CD='P8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MA' where VNDR_CNTRY_CD='P9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MU' where VNDR_CNTRY_CD='Q0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='Q1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='OM' where VNDR_CNTRY_CD='Q4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ME' where VNDR_CNTRY_CD='Q6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AN' where VNDR_CNTRY_CD='R0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NU' where VNDR_CNTRY_CD='R2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NE' where VNDR_CNTRY_CD='R4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='VU' where VNDR_CNTRY_CD='R5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NG' where VNDR_CNTRY_CD='R6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SR' where VNDR_CNTRY_CD='S1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NI' where VNDR_CNTRY_CD='S2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ZZ' where VNDR_CNTRY_CD='S4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PY' where VNDR_CNTRY_CD='S5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PN' where VNDR_CNTRY_CD='S6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='XP' where VNDR_CNTRY_CD='S8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='XS' where VNDR_CNTRY_CD='S9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PA' where VNDR_CNTRY_CD='T2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PT' where VNDR_CNTRY_CD='T3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PG' where VNDR_CNTRY_CD='T4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PW' where VNDR_CNTRY_CD='T5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GW' where VNDR_CNTRY_CD='T6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='MH' where VNDR_CNTRY_CD='T9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PH' where VNDR_CNTRY_CD='U1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PR' where VNDR_CNTRY_CD='U2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='RU' where VNDR_CNTRY_CD='U3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PM' where VNDR_CNTRY_CD='U6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='KN' where VNDR_CNTRY_CD='U7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SC' where VNDR_CNTRY_CD='U8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ZA' where VNDR_CNTRY_CD='U9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SN' where VNDR_CNTRY_CD='V0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SG' where VNDR_CNTRY_CD='V5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ES' where VNDR_CNTRY_CD='V7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='RS' where VNDR_CNTRY_CD='V8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='LC' where VNDR_CNTRY_CD='V9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SD' where VNDR_CNTRY_CD='W0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SJ' where VNDR_CNTRY_CD='W1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SE' where VNDR_CNTRY_CD='W2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='CH' where VNDR_CNTRY_CD='W4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='AE' where VNDR_CNTRY_CD='W5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TT' where VNDR_CNTRY_CD='W6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TF' where VNDR_CNTRY_CD='W7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TJ' where VNDR_CNTRY_CD='W9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TC' where VNDR_CNTRY_CD='X0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TK' where VNDR_CNTRY_CD='X1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TO' where VNDR_CNTRY_CD='X2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TG' where VNDR_CNTRY_CD='X3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ST' where VNDR_CNTRY_CD='X4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TN' where VNDR_CNTRY_CD='X5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TR' where VNDR_CNTRY_CD='X6';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='TM' where VNDR_CNTRY_CD='X9';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='GB' where VNDR_CNTRY_CD='Y2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UA' where VNDR_CNTRY_CD='Y3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SU' where VNDR_CNTRY_CD='Y4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='VG' where VNDR_CNTRY_CD='Z0';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='VN' where VNDR_CNTRY_CD='Z1';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='VI' where VNDR_CNTRY_CD='Z2';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='VA' where VNDR_CNTRY_CD='Z3';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='NA' where VNDR_CNTRY_CD='Z4';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='PS' where VNDR_CNTRY_CD='Z5';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='EH' where VNDR_CNTRY_CD='Z7';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='UM' where VNDR_CNTRY_CD='Z8';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='SZ' where VNDR_CNTRY_CD='00';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='YE' where VNDR_CNTRY_CD='01';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='YU' where VNDR_CNTRY_CD='02';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ZM' where VNDR_CNTRY_CD='03';
UPDATE AP_CRDT_MEMO_T SET VNDR_CNTRY_CD='ZW' where VNDR_CNTRY_CD='04';

