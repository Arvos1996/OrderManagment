import {Breadcrumb, Layout, Menu} from 'antd';
import {DesktopOutlined, FileOutlined, PieChartOutlined, TeamOutlined, UserOutlined} from '@ant-design/icons';
import {Component} from "react";
import {Link} from "react-router-dom";
import DataTable from "./ContactView";
import {Route, Switch} from "react-router";
import NewOrderForm from "./NewOrderForm";
import OrderTabMenu from "./OrderTabMenu";

const {Header, Content, Footer, Sider} = Layout;
const {SubMenu} = Menu;

class DashboardMenu extends Component {
    state = {
        collapsed: false,
    };

    onCollapse = collapsed => {
        console.log(collapsed);
        this.setState({collapsed});
    };

    render() {
        const {collapsed} = this.state;
        return (
            <Layout style={{ minHeight: '100vh' }}>
                <Sider collapsible collapsed={collapsed} onCollapse={this.onCollapse}>
                    <div className="logo" />
                    <Menu theme="dark" defaultSelectedKeys={['1']} mode="inline">
                        <Menu.Item key="1" icon={<PieChartOutlined />}>
                            <Link to= "/createneworder" > Create New Order </Link>
                        </Menu.Item>
                        <Menu.Item key="2" icon={<DesktopOutlined />}>
                            <Link to= "/contacts" > Contact List </Link>
                        </Menu.Item>
                        <SubMenu key="sub1" icon={<UserOutlined />} title="User">
                            <Menu.Item key="3">Tom</Menu.Item>
                            <Menu.Item key="4">Bill</Menu.Item>
                            <Menu.Item key="5">Alex</Menu.Item>
                        </SubMenu>
                        <SubMenu key="sub2" icon={<TeamOutlined />} title="Settlement Data">
                            <Menu.Item key="6">Sales Info</Menu.Item>
                            <Menu.Item key="8">Ext Invoice Data</Menu.Item>
                        </SubMenu>
                        <Menu.Item key="9" icon={<FileOutlined />}>
                            Settings
                        </Menu.Item>
                    </Menu>
                </Sider>
                <Layout className="site-layout">
                    <Header className="site-layout-background" style={{ padding: 0 }} > <OrderTabMenu/> </Header>
                    <Content style={{ margin: '0 16px' }}>
                        <Switch>
                            <Route path = "/contacts">
                                <Breadcrumb style={{ margin: '16px 0' }}>
                                    <Breadcrumb.Item>Contacts</Breadcrumb.Item>
                                </Breadcrumb>
                                <DataTable/>
                            </Route>
                            <Route path = "/createneworder">
                                <Breadcrumb style={{ margin: '16px 0' }}>
                                    <Breadcrumb.Item> Create New Order</Breadcrumb.Item>
                                </Breadcrumb>
                                <NewOrderForm />
                            </Route>
                            <Route path = "/showorder">
                                <NewOrderForm />
                            </Route>
                        </Switch>
                    </Content>
                    <Footer style={{ textAlign: 'center' }}>Created by Arvos</Footer>
                </Layout>
            </Layout>
        );
    }
}

export default DashboardMenu;